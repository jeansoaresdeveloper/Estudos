import 'package:flutter/material.dart';

class FormScreen extends StatefulWidget {
  const FormScreen({super.key});

  @override
  State<StatefulWidget> createState() => _FormScreenState();
}

class _FormScreenState extends State<FormScreen> {
  TextEditingController nameController = TextEditingController();
  TextEditingController difficultyController = TextEditingController();
  TextEditingController imageController = TextEditingController();

  final _formKey = GlobalKey<FormState>();

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Form(
        key: _formKey,
        child: Scaffold(
            appBar: AppBar(
              title: const Text(
                "Nova Tarefa",
                style: TextStyle(color: Colors.white),
              ),
              backgroundColor: Colors.blue,
            ),
            body: Padding(
              padding: const EdgeInsets.all(8),
              child: Container(
                  height: 600,
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(20),
                    border: const Border(
                        bottom: BorderSide(width: 2, color: Colors.green),
                        top: BorderSide(width: 2, color: Colors.green)),
                  ),
                  child: Padding(
                    padding: const EdgeInsets.all(20),
                    child: Column(
                      children: [
                        Padding(
                          padding: const EdgeInsets.only(bottom: 16.0),
                          child: TextFormField(
                            validator: (value) {
                              if (value!.isEmpty) {
                                return 'Informe o nome';
                              }
                              return null;
                            },
                            controller: nameController,
                            decoration: const InputDecoration(
                              icon:
                                  Icon(Icons.task_rounded, color: Colors.green),
                              hintText: 'Nome',
                            ),
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsets.only(bottom: 16.0),
                          child: TextFormField(
                            validator: (value) {
                              if (value!.isEmpty ||
                                  int.parse(value) > 5 ||
                                  int.parse(value) < 1) {
                                return 'Informe uma dificuldade entre 1 e 5';
                              }
                              return null;
                            },
                            keyboardType: TextInputType.number,
                            controller: difficultyController,
                            decoration: const InputDecoration(
                              icon: Icon(Icons.handshake_sharp,
                                  color: Colors.green),
                              hintText: 'Dificuldade',
                            ),
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsets.only(bottom: 16.0),
                          child: TextFormField(
                            validator: (value) {
                              if (value!.isEmpty) {
                                return 'Informe uma imagem';
                              }
                              return null;
                            },
                            onChanged: (text) => setState(() {}),
                            controller: imageController,
                            decoration: const InputDecoration(
                              icon: Icon(Icons.image, color: Colors.green),
                              hintText: 'Imagem',
                            ),
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsets.only(bottom: 16.0),
                          child: Container(
                            height: 100,
                            width: 72,
                            decoration: BoxDecoration(
                              borderRadius: BorderRadius.circular(20),
                            ),
                            child: ClipRRect(
                              borderRadius: BorderRadius.circular(10),
                              child: Image.network(
                                imageController.text,
                                errorBuilder: (BuildContext context,
                                    Object exception, StackTrace? stackTrace) {
                                  return Container();
                                },
                                fit: BoxFit.cover,
                              ),
                            ),
                          ),
                        ),
                        ElevatedButton(
                          onPressed: () {
                            if (_formKey.currentState!.validate()) {
                              print(nameController.text);
                              print(int.parse(difficultyController.text));
                              print(imageController.text);

                              ScaffoldMessenger.of(context).showSnackBar(
                                const SnackBar(
                                  showCloseIcon: true,
                                  backgroundColor: Colors.amber,
                                  content: Text("Salvando tarefa"),
                                ),
                              );

                              Navigator.pop(context);
                            }
                          },
                          style: ButtonStyle(
                            minimumSize: WidgetStateProperty.all(
                                const Size(double.infinity, 40)),
                            shape:
                                WidgetStateProperty.all<RoundedRectangleBorder>(
                              const RoundedRectangleBorder(
                                borderRadius: BorderRadiusDirectional.all(
                                    Radius.circular(10)),
                              ),
                            ),
                          ),
                          child: const Icon(Icons.abc_outlined),
                        ),
                      ],
                    ),
                  )),
            )),
      ),
    );
  }
}
