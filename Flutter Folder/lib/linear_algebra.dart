import 'package:flutter/material.dart';
import 'package:main_menu/hyperlink.dart';

class LinearAlgebra extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Linear Algebra Books'),
        centerTitle: true,
      ),
      body: Container(
        color: Colors.white38,
        child:Column(
        children: <Widget>[
          SizedBox(height: 20.0),
          Hyperlink('https://www.amazon.com/Linear-Algebra-Its-Applications-5th/dp/032198238X/ref=sr_1_5?crid=397NXLQFHMUA6&dchild=1&keywords=linear+algebra&qid=1587663543&s=books&sprefix=Linear+%2Cstripbooks-intl-ship%2C381&sr=1-5', 'Linear Algebra and its applications By David C.Lay'),
          
          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Linear-Algebra-Introduction-David-Poole/dp/8131530248', 'Linear Algebra: A modern Introduction'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Elementary-Linear-Algebra-International-Larson/dp/1133111343', 'Elementary Linear Algebra: International Edition'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.com/Schaums-Outline-Introduction-Probability-Statistics/dp/0071762493', 'Schaums Outline of Introduction to Probability and Statistics'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.meripustak.com/HIGHER-ENGINEERING-MATHEMATICS-103101?https://www.meripustak.com&gclid=EAIaIQobChMIic-Yn6P_6AIVjXwrCh0d9wKfEAYYASABEgLD1PD_BwE', 'HIGHER ENGINEERING MATHEMATICS by RAMANA, McGraw Hill'),

          SizedBox(height: 20.0),
          Hyperlink('https://www.meripustak.com/Linear-AlgebraAnd-Its-Applications--125242', 'Linear Algebra And Its Applications by Ganesh, CBS PUBLICATION'),

          SizedBox(height: 20.0),
          Hyperlink('https://www.meripustak.com/Linear-Algebra-With-App-102050', 'Linear Algebra With App. by Defranza, McGraw Hill')

        
        ],
      ),)
    );
  }
}