# JavsScript Study Note

0. Syntax
   0.1. Object

   ```
   <!--* Declare Object   -->
   const playerName = "nico";
   const playerPoints = 123;
   const playerSomething =123;

   const player = {
       name        : "nico",
       points      : 123,
       something   : 123,
       sayHello    : function(){
           console.log("hello!");
       },
   };
   ->
   player.name
   player.points
   player.something
   player.sayHello();
   ```

   0.2. Equlity

   JS에서 ==은 개발자의 의도와 상관없이 자동 타입변환이 이루어져,
   결과를 예측하기 어렵고 실수하기 쉽다.
   따라서 타입 변환 없이, 타입과 값 모두를 엄격히 비교하는
   ===을 사용해 비교하는게 좋다.
