import 'package:flutter/material.dart';
import 'package:my_app/components/tarefa.dart';
import 'package:my_app/screens/form_screen.dart';

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<StatefulWidget> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  bool opacidade = true;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Organizador de tarefas"),
        backgroundColor: Colors.blue,
        titleTextStyle: const TextStyle(color: Colors.white),
      ),
      body: AnimatedOpacity(
        opacity: opacidade ? 1 : 0,
        duration: const Duration(milliseconds: 300),
        child: ListView(
          children: const [
            Tarefa("Mundo Maneiro", 3),
            Tarefa("Mundo Legal", 2),
            Tarefa("Mundo Bacana", 5),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () => Navigator.push(
          context,
          MaterialPageRoute(builder: (context) => const FormScreen()),
        ),
        child: const Icon(Icons.add),
      ),
    );
  }
}
