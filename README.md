Main javap

```
  SHA-256 checksum 030b3b6576069145c1de80def9672206bac95baa9552ccfc7ca02b2b00f3a04f
  Compiled from "Main.scala"
public class example.Main
  minor version: 0
  major version: 61
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #2                          // example/Main
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 10, attributes: 5
Constant pool:
    #1 = Utf8               example/Main
    #2 = Class              #1            // example/Main
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               Main.scala
    #6 = Utf8               example/B$package$B$
    #7 = Class              #6            // example/B$package$B$
    #8 = Utf8               example/B$package
    #9 = Class              #8            // example/B$package
   #10 = Utf8               B$
   #11 = Utf8               java/lang/invoke/MethodHandles$Lookup
   #12 = Class              #11           // java/lang/invoke/MethodHandles$Lookup
   #13 = Utf8               java/lang/invoke/MethodHandles
   #14 = Class              #13           // java/lang/invoke/MethodHandles
   #15 = Utf8               Lookup
   #16 = Utf8               size
   #17 = Utf8               ()I
   #18 = Utf8               example/Main$
   #19 = Class              #18           // example/Main$
   #20 = Utf8               MODULE$
   #21 = Utf8               Lexample/Main$;
   #22 = NameAndType        #20:#21       // MODULE$:Lexample/Main$;
   #23 = Fieldref           #19.#22       // example/Main$.MODULE$:Lexample/Main$;
   #24 = NameAndType        #16:#17       // size:()I
   #25 = Methodref          #19.#24       // example/Main$.size:()I
   #26 = Utf8               valuesA
   #27 = Utf8               ()Lscala/collection/immutable/Seq;
   #28 = Utf8               ()Lscala/collection/immutable/Seq<Lexample/A;>;
   #29 = NameAndType        #26:#27       // valuesA:()Lscala/collection/immutable/Seq;
   #30 = Methodref          #19.#29       // example/Main$.valuesA:()Lscala/collection/immutable/Seq;
   #31 = Utf8               valuesB
   #32 = Utf8               ()Lscala/collection/immutable/Seq<Ljava/lang/Object;>;
   #33 = NameAndType        #31:#27       // valuesB:()Lscala/collection/immutable/Seq;
   #34 = Methodref          #19.#33       // example/Main$.valuesB:()Lscala/collection/immutable/Seq;
   #35 = Utf8               <init>
   #36 = Utf8               ()V
   #37 = NameAndType        #35:#36       // "<init>":()V
   #38 = Methodref          #4.#37        // java/lang/Object."<init>":()V
   #39 = Utf8               this
   #40 = Utf8               Lexample/Main;
   #41 = Utf8               value_class
   #42 = Utf8               Lorg/openjdk/jmh/annotations/Benchmark;
   #43 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #44 = MethodType         #43           //  (Ljava/lang/Object;)Ljava/lang/Object;
   #45 = Utf8               value_class$$anonfun$adapted$1
   #46 = NameAndType        #45:#43       // value_class$$anonfun$adapted$1:(Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Methodref          #2.#46        // example/Main.value_class$$anonfun$adapted$1:(Ljava/lang/Object;)Ljava/lang/Object;
   #48 = MethodHandle       6:#47         // REF_invokeStatic example/Main.value_class$$anonfun$adapted$1:(Ljava/lang/Object;)Ljava/lang/Object;
   #49 = Integer            1
   #50 = Utf8               java/lang/invoke/LambdaMetafactory
   #51 = Class              #50           // java/lang/invoke/LambdaMetafactory
   #52 = Utf8               altMetafactory
   #53 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #54 = NameAndType        #52:#53       // altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #55 = Methodref          #51.#54       // java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #56 = MethodHandle       6:#55         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #57 = Utf8               apply
   #58 = Utf8               ()Lscala/Function1;
   #59 = NameAndType        #57:#58       // apply:()Lscala/Function1;
   #60 = InvokeDynamic      #0:#59        // #0:apply:()Lscala/Function1;
   #61 = Utf8               scala/collection/immutable/Seq
   #62 = Class              #61           // scala/collection/immutable/Seq
   #63 = Utf8               map
   #64 = Utf8               (Lscala/Function1;)Ljava/lang/Object;
   #65 = NameAndType        #63:#64       // map:(Lscala/Function1;)Ljava/lang/Object;
   #66 = InterfaceMethodref #62.#65       // scala/collection/immutable/Seq.map:(Lscala/Function1;)Ljava/lang/Object;
   #67 = Utf8               opaque_type
   #68 = Utf8               (I)I
   #69 = MethodType         #68           //  (I)I
   #70 = Utf8               opaque_type$$anonfun$1
   #71 = NameAndType        #70:#68       // opaque_type$$anonfun$1:(I)I
   #72 = Methodref          #2.#71        // example/Main.opaque_type$$anonfun$1:(I)I
   #73 = MethodHandle       6:#72         // REF_invokeStatic example/Main.opaque_type$$anonfun$1:(I)I
   #74 = Utf8               apply$mcII$sp
   #75 = Utf8               ()Lscala/runtime/java8/JFunction1$mcII$sp;
   #76 = NameAndType        #74:#75       // apply$mcII$sp:()Lscala/runtime/java8/JFunction1$mcII$sp;
   #77 = InvokeDynamic      #1:#76        // #1:apply$mcII$sp:()Lscala/runtime/java8/JFunction1$mcII$sp;
   #78 = Utf8               value_class$$anonfun$1
   #79 = Utf8               _$3
   #80 = Utf8               example/A$
   #81 = Class              #80           // example/A$
   #82 = Utf8               Lexample/A$;
   #83 = NameAndType        #20:#82       // MODULE$:Lexample/A$;
   #84 = Fieldref           #81.#83       // example/A$.MODULE$:Lexample/A$;
   #85 = Utf8               add$extension
   #86 = Utf8               (II)I
   #87 = NameAndType        #85:#86       // add$extension:(II)I
   #88 = Methodref          #81.#87       // example/A$.add$extension:(II)I
   #89 = Utf8               I
   #90 = Utf8               v1
   #91 = Utf8               example/A
   #92 = Class              #91           // example/A
   #93 = Utf8               scala/runtime/BoxesRunTime
   #94 = Class              #93           // scala/runtime/BoxesRunTime
   #95 = Utf8               unboxToInt
   #96 = Utf8               (Ljava/lang/Object;)I
   #97 = NameAndType        #95:#96       // unboxToInt:(Ljava/lang/Object;)I
   #98 = Methodref          #94.#97       // scala/runtime/BoxesRunTime.unboxToInt:(Ljava/lang/Object;)I
   #99 = Utf8               value
  #100 = NameAndType        #99:#17       // value:()I
  #101 = Methodref          #92.#100      // example/A.value:()I
  #102 = NameAndType        #78:#68       // value_class$$anonfun$1:(I)I
  #103 = Methodref          #2.#102       // example/Main.value_class$$anonfun$1:(I)I
  #104 = Utf8               (I)V
  #105 = NameAndType        #35:#104      // "<init>":(I)V
  #106 = Methodref          #92.#105      // example/A."<init>":(I)V
  #107 = Utf8               Ljava/lang/Object;
  #108 = Utf8               _$4
  #109 = Utf8               Lexample/B$package$B$;
  #110 = NameAndType        #20:#109      // MODULE$:Lexample/B$package$B$;
  #111 = Fieldref           #7.#110       // example/B$package$B$.MODULE$:Lexample/B$package$B$;
  #112 = Utf8               add
  #113 = NameAndType        #112:#86      // add:(II)I
  #114 = Methodref          #7.#113       // example/B$package$B$.add:(II)I
  #115 = Utf8               $deserializeLambda$
  #116 = Utf8               (Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #117 = Utf8               scala/runtime/LambdaDeserialize
  #118 = Class              #117          // scala/runtime/LambdaDeserialize
  #119 = Utf8               bootstrap
  #120 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #121 = NameAndType        #119:#120     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #122 = Methodref          #118.#121     // scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #123 = MethodHandle       6:#122        // REF_invokeStatic scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #124 = Utf8               lambdaDeserialize
  #125 = NameAndType        #124:#116     // lambdaDeserialize:(Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #126 = InvokeDynamic      #2:#125       // #2:lambdaDeserialize:(Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #127 = Utf8               Code
  #128 = Utf8               Signature
  #129 = Utf8               LineNumberTable
  #130 = Utf8               LocalVariableTable
  #131 = Utf8               RuntimeVisibleAnnotations
  #132 = Utf8               MethodParameters
  #133 = Utf8               StackMapTable
  #134 = Utf8               InnerClasses
  #135 = Utf8               SourceFile
  #136 = Utf8               BootstrapMethods
  #137 = Utf8               TASTY
  #138 = Utf8               Scala
{
  public static int size();
    descriptor: ()I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #23                 // Field example/Main$.MODULE$:Lexample/Main$;
         3: invokevirtual #25                 // Method example/Main$.size:()I
         6: ireturn
    Signature: #17                          // ()I

  public static scala.collection.immutable.Seq<example.A> valuesA();
    descriptor: ()Lscala/collection/immutable/Seq;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #23                 // Field example/Main$.MODULE$:Lexample/Main$;
         3: invokevirtual #30                 // Method example/Main$.valuesA:()Lscala/collection/immutable/Seq;
         6: areturn
    Signature: #28                          // ()Lscala/collection/immutable/Seq<Lexample/A;>;

  public static scala.collection.immutable.Seq<java.lang.Object> valuesB();
    descriptor: ()Lscala/collection/immutable/Seq;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #23                 // Field example/Main$.MODULE$:Lexample/Main$;
         3: invokevirtual #34                 // Method example/Main$.valuesB:()Lscala/collection/immutable/Seq;
         6: areturn
    Signature: #32                          // ()Lscala/collection/immutable/Seq<Ljava/lang/Object;>;

  public example.Main();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #38                 // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 13: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lexample/Main;

  public scala.collection.immutable.Seq<example.A> value_class();
    descriptor: ()Lscala/collection/immutable/Seq;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #23                 // Field example/Main$.MODULE$:Lexample/Main$;
         3: invokevirtual #30                 // Method example/Main$.valuesA:()Lscala/collection/immutable/Seq;
         6: invokedynamic #60,  0             // InvokeDynamic #0:apply:()Lscala/Function1;
        11: invokeinterface #66,  2           // InterfaceMethod scala/collection/immutable/Seq.map:(Lscala/Function1;)Ljava/lang/Object;
        16: checkcast     #62                 // class scala/collection/immutable/Seq
        19: areturn
      LineNumberTable:
        line 16: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lexample/Main;
    Signature: #28                          // ()Lscala/collection/immutable/Seq<Lexample/A;>;
    RuntimeVisibleAnnotations:
      0: #42()
        org.openjdk.jmh.annotations.Benchmark

  public scala.collection.immutable.Seq<java.lang.Object> opaque_type();
    descriptor: ()Lscala/collection/immutable/Seq;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #23                 // Field example/Main$.MODULE$:Lexample/Main$;
         3: invokevirtual #34                 // Method example/Main$.valuesB:()Lscala/collection/immutable/Seq;
         6: invokedynamic #77,  0             // InvokeDynamic #1:apply$mcII$sp:()Lscala/runtime/java8/JFunction1$mcII$sp;
        11: invokeinterface #66,  2           // InterfaceMethod scala/collection/immutable/Seq.map:(Lscala/Function1;)Ljava/lang/Object;
        16: checkcast     #62                 // class scala/collection/immutable/Seq
        19: areturn
      LineNumberTable:
        line 21: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lexample/Main;
    Signature: #32                          // ()Lscala/collection/immutable/Seq<Ljava/lang/Object;>;
    RuntimeVisibleAnnotations:
      0: #42()
        org.openjdk.jmh.annotations.Benchmark
}
InnerClasses:
  public static final #10= #7 of #9;      // B$=class example/B$package$B$ of class example/B$package
  public static final #15= #12 of #14;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
SourceFile: "Main.scala"
BootstrapMethods:
  0: #56 REF_invokeStatic java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #44 (Ljava/lang/Object;)Ljava/lang/Object;
      #48 REF_invokeStatic example/Main.value_class$$anonfun$adapted$1:(Ljava/lang/Object;)Ljava/lang/Object;
      #44 (Ljava/lang/Object;)Ljava/lang/Object;
      #49 1
  1: #56 REF_invokeStatic java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #69 (I)I
      #73 REF_invokeStatic example/Main.opaque_type$$anonfun$1:(I)I
      #69 (I)I
      #49 1
  2: #123 REF_invokeStatic scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #48 REF_invokeStatic example/Main.value_class$$anonfun$adapted$1:(Ljava/lang/Object;)Ljava/lang/Object;
      #73 REF_invokeStatic example/Main.opaque_type$$anonfun$1:(I)I
  TASTY: length = 0x10 (unknown attribute)
   00 99 EF C4 6C DD FF A3 00 DB 3E 66 70 80 5E 28

  Scala: length = 0x0 (unknown attribute)
```
