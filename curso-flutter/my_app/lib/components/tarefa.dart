import 'package:flutter/material.dart';
import 'package:my_app/components/dificuldade.dart';

class Tarefa extends StatefulWidget {
  final String nome;
  final int dificuldade;

  const Tarefa(this.nome, this.dificuldade, {super.key});

  @override
  State<StatefulWidget> createState() => _TarefaState();
}

class _TarefaState extends State<Tarefa> {
  int count = 0;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(8.0),
      child: Container(
        color: Colors.white,
        child: Stack(
          children: [
            Container(
              height: 150,
              decoration: const BoxDecoration(
                  color: Colors.blue,
                  borderRadius: BorderRadius.all(Radius.circular(10))),
            ),
            Column(
              children: [
                Container(
                  decoration: const BoxDecoration(
                    color: Colors.white,
                  ),
                  height: 100,
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Container(
                          color: Colors.transparent,
                          width: 72,
                          height: 100,
                          child: ClipRRect(
                            borderRadius: BorderRadius.circular(10),
                            child: Image.network(
                              "https://pbs.twimg.com/media/Eu7m692XIAEvxxP?format=png&name=large",
                              fit: BoxFit.contain,
                            ),
                          )),
                      Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          SizedBox(
                            width: 300,
                            child: Text(
                              widget.nome,
                              style: const TextStyle(fontSize: 24),
                              overflow: TextOverflow.ellipsis,
                            ),
                          ),
                          Dificuldade(
                            level: widget.dificuldade,
                          ),
                        ],
                      ),
                      ElevatedButton(
                          onPressed: () => setState(() {
                                count++;
                              }),
                          child: const Icon(Icons.arrow_circle_up_sharp))
                    ],
                  ),
                ),
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      SizedBox(
                          width: 200,
                          child: LinearProgressIndicator(
                            color: Colors.white,
                            value: (widget.dificuldade > 0)
                                ? (count / widget.dificuldade) / 10
                                : 1,
                          )),
                      Text(
                        'Nível: $count',
                        style: const TextStyle(color: Colors.white),
                      )
                    ],
                  ),
                ),
              ],
            )
          ],
        ),
      ),
    );
  }
}
