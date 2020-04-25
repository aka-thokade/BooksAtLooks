import 'package:flutter/material.dart';
import 'subject.dart';


class Buy_Book extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Buy Book',
        style: TextStyle(
          fontSize: 25.0
        ),
        ),
        centerTitle: true,
      
      ),
      body: Subjects()
      );
      
  
  }
}