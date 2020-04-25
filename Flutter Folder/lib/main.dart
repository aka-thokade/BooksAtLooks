import 'package:flutter/material.dart';
import 'raised_button.dart';

 
void main() {
  runApp(MyApp());
}
 
class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}
 
class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(

      debugShowCheckedModeBanner: false,
      home: Home(),
      /* initialRoute: '/',
      routes: {
        'home':(context) => Home(),
        '/buy':(context) => Buy_Book(),
      }, */
      );
      
  }
}
