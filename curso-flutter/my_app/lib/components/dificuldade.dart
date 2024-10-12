import 'package:flutter/material.dart';

class Dificuldade extends StatelessWidget {

  final int level;

  const Dificuldade({required this.level, super.key});

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        Icon(
          Icons.star,
          size: 15,
          color: (level >= 1) ? Colors.blue : Colors.blue[100],
        ),
        Icon(
          Icons.star,
          size: 15,
          color: (level >= 2) ? Colors.blue : Colors.blue[100],
        ),
        Icon(
          Icons.star,
          size: 15,
          color: (level >= 3) ? Colors.blue : Colors.blue[100],
        ),
        Icon(
          Icons.star,
          size: 15,
          color: (level >= 4) ? Colors.blue : Colors.blue[100],
        ),
        Icon(
          Icons.star,
          size: 15,
          color: (level >= 5) ? Colors.blue : Colors.blue[100],
        ),
      ],
    );
  }
}
