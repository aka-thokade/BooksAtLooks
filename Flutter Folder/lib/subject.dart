import 'package:flutter/material.dart';
import 'linear_algebra.dart';
import 'mechatronics.dart';
import 'programming1.dart';
import 'programming2.dart';
class Subjects extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final body = Container(
            constraints: BoxConstraints(
              minWidth: 500.0
            ),
            decoration: BoxDecoration(
              image: DecorationImage(image: NetworkImage('https://www.rd.com/wp-content/uploads/2019/11/shutterstock_509582812-e1574100998595.jpg'),
              fit: BoxFit.fill)
            ),
            child: Column(children: <Widget>[            
             
              SizedBox(height: 30.0,),

              RaisedButton(
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15.0)),
              color: Colors.white70,
                onPressed: () {
                  Route route = MaterialPageRoute(
                    builder: (context) => LinearAlgebra()
                    );
                    Navigator.push(context, route);
                },
                textColor: Colors.black,
                splashColor: Colors.redAccent,
                  padding: const EdgeInsets.fromLTRB(70.0, 35.0, 70.0, 35.0),
                  child: const Text('Linear Algebra',
                  style: TextStyle(
                    fontSize: 25.0
                  ),
                 ),),
              SizedBox(height: 30.0,),
              RaisedButton(
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15.0)),
                color: Colors.white70,
                onPressed: () {
                  Route route = MaterialPageRoute(
                    builder: (context) => Mechatronics()
                    );
                    Navigator.push(context, route);
                },
                textColor: Colors.black,
                splashColor: Colors.redAccent,
                  padding: const EdgeInsets.fromLTRB(100.0, 35.0, 100.0, 35.0),
                  child: const Text('Robotics',
                  style: TextStyle(
                    fontSize: 25.0
                  ),
                 ),
              ),
              SizedBox(height: 30.0,),
              RaisedButton(
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15.0)),
                color: Colors.white70,
                onPressed: () {
                  Route route = MaterialPageRoute(
                    builder: (context) => CProgramming()
                    );
                    Navigator.push(context, route);
                },
                textColor: Colors.black,
                splashColor: Colors.redAccent,
                  padding: const EdgeInsets.fromLTRB(55.0, 35.0, 55.0, 35.0),
                  child: const Text(' C Programming',
                  style: TextStyle(fontSize: 25.0),),                
              ),
              SizedBox(height: 30.0,),
              RaisedButton(
                
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15.0)),
                color: Colors.white70,
                onPressed: () {
                  Route route = MaterialPageRoute(
                    builder: (context) => Python()
                    );
                    Navigator.push(context, route);
                },
                textColor: Colors.black,
                splashColor: Colors.redAccent,
                  padding: const EdgeInsets.fromLTRB(20.0, 35.0, 25.0, 35.0),
                  child: const Text(' Python Programming ',
                  style: TextStyle(
                    fontSize: 25.0
                  ),
                 ),),
               
              
              
          ]));
    return Scaffold(
      body: body,
    );
  }
}