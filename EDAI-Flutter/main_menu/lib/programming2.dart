import 'package:flutter/material.dart';
import 'package:main_menu/hyperlink.dart';

class Python extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Python Programming Books'),
        centerTitle: true,
      ),
      body: Column(
        children: <Widget>[
          SizedBox(height: 20.0,),
          Hyperlink('https://www.flipkart.com/programming-problem-solving-python/p/itmfy76xavz98kgj', 'Programming and Problem Solving with Python'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.flipkart.com/beginning-programming-python-dummies/p/itmfbnypf7ncqfch', 'Beginning Programming with Python For Dummies'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.com/Dive-Into-Python-Pilgrim-2009-05-03/dp/B01F81O8SA', 'Dive Into Python 3 by Mark Pilgrim'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.flipkart.com/python-makes-programming-fun/p/itmdx929wqpzhnaz', 'Python - Makes Programming Fun !'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.com/Learning-Python-5th-Mark-Lutz/dp/1449355730', 'Learning Python')
        
        ],
      ),
    );
  }
}