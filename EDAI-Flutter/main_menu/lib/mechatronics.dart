import 'package:flutter/material.dart';
import 'package:main_menu/hyperlink.dart';

class Mechatronics extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Robotics Books'),
        centerTitle: true,
      ),
      body: Container(
        
        child:Column(
        children: <Widget>[
          SizedBox(height: 20.0),
          Hyperlink('https://www.abebooks.com/first-edition/Robotics-Control-I.J-Nagrath-R.K-Mittal/4925497439/bd', 'Robotics and Control I.J.NagrathR.K. Mittal'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.abebooks.com/book-search/title/introduction-mechatronics-measurement-systems/author/david-alciatore/', 'Introduction Mechatronics Measurement Systems by David Alciatore'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Introduction-Robotics-Mechanics-John-Craig/dp/0201543613', 'Introduction to Robotics: Mechanics and Control by John J. Craig'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.com/Robotic-Engineering-Integrated-Richard-Klafter/dp/0134687523', 'Robotic Engineering: An Integrated Approach'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Robot-Building-Beginners-Technology-Action/dp/1430227486', 'Robot Building for Beginners (Technology in Action) '),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Introduction-AI-Robotics-Robin-Murphy/dp/0262133830', 'Introduction to AI Robotics 2e (Intelligent Robotics and Autonomous Agents series) '),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/LEGO-MINDSTORMS-EV3-Discovery-Book-ebook/dp/B00KVPM908', 'The LEGO MINDSTORMS EV3 Discovery Book ')

        
        ],
      ),)
    );
  }
}