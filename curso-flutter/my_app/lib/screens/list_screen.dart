
import 'package:flutter/material.dart';

class ListaPlantasTela extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final plantas = Provider.of<>(context).getPlantas;

    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de Plantas'),
      ),
      body: ListView.builder(
        itemCount: plantas.length,
        itemBuilder: (context, index) {
          final planta = plantas[index];
          return ListTile(
            title: Text(planta.nome),
            subtitle: Text(planta.descricao),
            leading: planta.url.isNotEmpty
                ? Image.network(planta.url, width: 50, height: 50, fit: BoxFit.cover)
                : Icon(Icons.image),
          );
        },
      ),
    );
  }
}