import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: Column(
        spacing: 200,
        children: [
          Container(color: Colors.amber, width: 200, height: 200,),
          Container(color: Colors.black, width: 100, height: 100,)
        ],
      ),
    );
  }
}