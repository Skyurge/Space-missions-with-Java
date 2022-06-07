import java.awt.*;
import java.awt.event.*;
//import java.util.StringTokenizer;
// import java.io.BufferedReader;
// import java.io.FileReader;
import java.io.*;
public class csv{
    int t=0,i=0;
    String line="",s;
    public csv() throws IOException{
        try{
            Frame f=new Frame("Space missions");
            f.setBackground(Color.BLACK);
        //TextField t = new TextField();
        // t.setBackground(Color.black);
        // t.setForeground(Color.white);
        // t.setEchoChar('$');
        // t.setBounds(20,100,150,30);

        // TextArea ta= new TextArea();
        // ta.setBounds(20,170,150,300);
        
        // Label l = new Label("Enter your password");
        // l.setForeground(Color.GREEN);
        // //l.setFont(SERIF);
        // l.setBounds(20,70,150,30);
        
            BufferedReader br = new BufferedReader(new FileReader("Space_Corrected.csv"));    

            Button b=new Button("SpaceX missions: ");
            b.setBackground(Color.RED);
            b.setBounds(20,40,200,30);

            Button b1=new Button("NASA missions: ");
            b1.setBackground(Color.RED);
            b1.setBounds(20,70,200,30);

            Button b2=new Button("ISRO missions: ");
            b2.setBackground(Color.RED);
            b2.setBounds(20,100,200,30);

            // Label l2 = new Label();
            // l2.setForeground(Color.BLUE);
            // l2.setBounds(20,100,10000,500);
            
            TextArea t1= new TextArea();
            t1.setBounds(20,150,1000,500);
            t1.setEditable(false);
            t1.setBackground(Color.BLACK);
            t1.setForeground(Color.RED);

            while ((s = br.readLine()) != null){
                line+=s;
            }

            // String[] q=line.split("\"");
            // boolean quoted = false,c=false; int a=0;
            // for(String q : line.split("\"")){
            //     if(quoted && c){
            //         System.out.print(q+ " ");
            //         if(a==1){
            //             c=false;
            //             System.out.println();
            //         }
            //         a++;
            //     }
            //     else
            //         for(String s : q.split(","))
            //             if(!s.isEmpty()){
            //                 if(s.equals("SpaceX")){
            //                     c=true;
            //                     a=0;
            //                 }
            //                 //System.out.println(s);
            //             }
            //     quoted = !quoted;
            // }

        // StringTokenizer st = new StringTokenizer(line, "\"");
        // boolean quoted = false;
        // while(st.hasMoreTokens()){
        //     if(quoted){
        //         System.out.println(st.nextToken());
        //     }
        //     else{
        //         for(String s : st.split(","))
        //             if(!s.trim().isEmpty())
        //                 System.out.println(s);
        //     }
        // }
        // Checkbox c1=new Checkbox("Maths");c1.setBounds(20,120,40,30);
        // Checkbox c2=new Checkbox("Science");c2.setBounds(20,150,40,30);
        // Checkbox c3=new Checkbox("Social");c3.setBounds(20,180,40,30);

        // List l1=new List(3);
        // l1.setBounds(20,250,100,30);
        // l1.add("Maths");
        // l1.add("Science");
        // l1.add("Social");

       // Scrollbar vertSB = new Scrollbar(Scrollbar.VERTICAL,0,1,0,500);

            f.add(b);
            f.add(b1);
            f.add(b2);
        // f.add(c1);
        // f.add(c2);
        // f.add(c3);
        //f.add(t);
       // f.add(l);
        //f.add(l2);
      //  f.add(vertSB);
        //f.add(ta);
        

            //SpaceX Action Listener
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        if(t==0){
                            t=1;
                            f.add(t1);
                            String tx=" ";
                            boolean quoted = false,c=false; int a=0;
                            for(String q : line.split("\"")){
                                if(quoted && c){
                                    tx+=q+ " ";
                                    if(a==1){
                                        c=false;
                                        tx+="\n";
                                    }
                                    a++;
                                }
                                else
                                    for(String s : q.split(","))
                                        if(!s.isEmpty()){
                                            if(s.equals("SpaceX")){
                                                c=true;
                                                a=0;
                                            }
                                            //System.out.println(s);
                                        }
                                quoted = !quoted;
                            }
                            t1.setText(tx);
                        }
                        else{
                            t=0;
                            f.remove(t1);
                        }
                    }
                    catch(Exception ex){
                        ex.printStackTrace();
                    }

                }
            });


            //Nasa Action Listener
            b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        if(t==0){
                            t=1;
                            f.add(t1);
                            String tx=" ";
                            boolean quoted = false,c=false; int a=0;
                            for(String q : line.split("\"")){
                                if(quoted && c){
                                    tx+=q+ " ";
                                    if(a==1){
                                        c=false;
                                        tx+="\n";
                                    }
                                    a++;
                                }
                                else
                                    for(String s : q.split(","))
                                        if(!s.isEmpty()){
                                            if(s.equals("NASA")){
                                                c=true;
                                                a=0;
                                            }
                                            //System.out.println(s);
                                        }
                                quoted = !quoted;
                            }
                            t1.setText(tx);
                        }
                        else{
                            t=0;
                            f.remove(t1);
                        }
                    }
                    catch(Exception ex){
                        ex.printStackTrace();
                    }

                }
            });


            //ISRO Action Listener
            b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        if(t==0){
                            t=1;
                            f.add(t1);
                            String tx=" ";
                            boolean quoted = false,c=false; int a=0;
                            for(String q : line.split("\"")){
                                if(quoted && c){
                                    tx+=q+ " ";
                                    if(a==1){
                                        c=false;
                                        tx+="\n";
                                    }
                                    a++;
                                }
                                else
                                    for(String s : q.split(","))
                                        if(!s.isEmpty()){
                                            if(s.equals("ISRO")){
                                                c=true;
                                                a=0;
                                            }
                                            //System.out.println(s);
                                        }
                                quoted = !quoted;
                            }
                            t1.setText(tx);
                        }
                        else{
                            t=0;
                            f.remove(t1);
                        }
                    }
                    catch(Exception ex){
                        ex.printStackTrace();
                    }

                }
            });



            //Frame Settings
            f.setLayout(null);
            f.setSize(700,500);
            f.setVisible(true);
            f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            });
            br.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
       // f.addWindowListener(this);
    }
    // public void windowClosing(WindowEvent e){
    //     Frame g=(Frame)e.getSource();
    //     g.dispose();
    // }
    // public void windowClosed(WindowEvent e){
    //     System.out.println("Window Closed");
    // }
    public static void main(String[] args){
        try{
        new csv();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
