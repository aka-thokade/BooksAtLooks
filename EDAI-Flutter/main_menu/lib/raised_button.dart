import 'package:flutter/material.dart';
import 'package:main_menu/buy_book.dart';
import 'bottom_navigaton.dart';
class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final appBar = AppBar(
            backgroundColor: Colors.blue,
            title: Text('Books At Looks',
            style: TextStyle(fontSize: 25.0),),
            centerTitle: true,
          );
    final body = Container(
            decoration: BoxDecoration(
              image: DecorationImage(image: AssetImage('assets/bg1.jpeg'),
              fit: BoxFit.fill)
            ),
            child: Column(children: <Widget>[                
              SizedBox(height: 20.0,),
              RaisedButton(
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15.0)),
                color: Colors.white70,
                onPressed: () {},
                textColor: Colors.black,
                splashColor: Colors.redAccent,
                  padding: const EdgeInsets.fromLTRB(60.0, 35.0, 60.0, 35.0),
                  child: const Text('Study Material',
                  style: TextStyle(fontSize: 25.0),),                
              ),
              SizedBox(height: 20.0,),
              RaisedButton(
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15.0)),
              color: Colors.white70,
                onPressed: () {},
                textColor: Colors.black,
                splashColor: Colors.redAccent,
                  padding: const EdgeInsets.fromLTRB(95.0, 35.0, 95.0, 35.0),
                  child: const Text('E-Books',
                  style: TextStyle(
                    fontSize: 25.0
                  ),
                 ),),
              SizedBox(height: 20.0,),
              RaisedButton(
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15.0)),
                color: Colors.white70,
                onPressed: () {},
                textColor: Colors.black,
                splashColor: Colors.redAccent,
                  padding: const EdgeInsets.fromLTRB(80.0, 35.0, 80.0, 35.0),
                  child: const Text('VIT Library',
                  style: TextStyle(
                    fontSize: 25.0
                  ),
                 ),
              ),
              SizedBox(height: 20.0,),
              RaisedButton(
                
                shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15.0)),
                color: Colors.white70,
                onPressed: () {
                  Route route = MaterialPageRoute(
                    builder: (context) => Buy_Book()
                    );
                    Navigator.push(context, route);
                },
                textColor: Colors.black,
                splashColor: Colors.redAccent,
                  padding: const EdgeInsets.fromLTRB(85.0, 35.0, 85.0, 35.0),
                  child: const Text('Buy Books',
                  style: TextStyle(
                    fontSize: 25.0
                  ),
                 ),),
              SizedBox(height: 60.0,),
              Bottom(),

              
          ]));
    
    return Scaffold(
      appBar: appBar,
      body: body,

    );
  }
}