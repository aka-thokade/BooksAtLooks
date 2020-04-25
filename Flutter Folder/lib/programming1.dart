import 'package:flutter/material.dart';
import 'package:main_menu/hyperlink.dart';

class CProgramming extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('C Programming Books'),
        centerTitle: true,
      ),
      body: Column(
        
        children: <Widget>[
          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Let-Us-C-Yashavant-Kanetkar/dp/8183331637', 'Let Us C by Yashwant Karnetkar'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Programming-Language-Kernighan-Dennis-Ritchie/dp/9332549443', 'The C Programming Language'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Programming-Language-Ansi-Version-Old/dp/8120305965', 'The C Programming Language Ansi Version '),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Programming-ANSIC-8e-Balagurusamy-ebook/dp/B07TSQN91S/ref=pd_simd_14_2/261-5184407-3010952?_encoding=UTF8&pd_rd_i=B07TSQN91S&pd_rd_r=26162e00-e0d9-4cbf-85eb-8e2c3b98c211&pd_rd_w=BFQFM&pd_rd_wg=GLSQV&pf_rd_p=189ccf44-51b2-4146-8c7f-876b3263b44b&pf_rd_r=448WQ5XQ7KQ7A51ZSFKR&psc=1&refRID=448WQ5XQ7KQ7A51ZSFKR', 'Programming in ANSI C'),

          SizedBox(height: 20.0,),
          Hyperlink('https://www.amazon.in/Expert-C-Programming-Deep-Secrets-ebook/dp/B00E0LASCU/ref=pd_simd_14_1/261-5184407-3010952?_encoding=UTF8&pd_rd_i=B00E0LASCU&pd_rd_r=efe1c3b8-045d-4dba-b8c6-087f7df669d0&pd_rd_w=EAIDS&pd_rd_wg=eqF2b&pf_rd_p=189ccf44-51b2-4146-8c7f-876b3263b44b&pf_rd_r=A4FJSNWQJ95JG5MG89J6&psc=1&refRID=A4FJSNWQJ95JG5MG89J6', 'Expert C Programming: Deep Secrets'),

        
        ],
      ),
    );
  }
}