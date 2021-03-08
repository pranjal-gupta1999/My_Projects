from tkinter import*
import sqlite3
from tkinter import messagebox
from tkinter import ttk
t=Tk()
t.geometry("600x400")
t.resizable(0,0)
f55=None
def login():
    g1=StringVar()
    g2=StringVar()
    f2=Frame(bg="#091e42")
    f2.place(x=0,y=0,width=600,height=400)
    un=Label(f2,text="Enter Name",bg="#091e42",fg="white",font=("",12))
    un.place(x=200,y=50)
    e1=Entry(f2,font=("",11),textvariable=g1)
    e1.place(x=300,y=50,width=130)
    def login1():
        db=sqlite3.connect('pranjal.db')
        cr=db.cursor()
        r1=cr.execute("select * from regis where UNAME='"+g1.get()+"' and UPASS= '"+g2.get()+"' ")
        for r in r1:
            messagebox.showinfo('Title','Welcome')
            mymenu()
            break
        else:
            messagebox.showinfo('Title','Invalid username & password')
        db.commit()
        db.close()
        g1.set("")
        g2.set("")
        
    up=Label(f2,text="Enter Pass",bg="#091e42",fg="white",font=("",12))
    up.place(x=200,y=100)
    e2=Entry(f2,font=("",11),show="*",textvariable=g2)
    e2.place(x=300,y=100,width=130)

    b1=Button(f2,text="Login",command=login1)
    b1.place(x=260,y=160,width=100,height=40)

    b2=Button(f2,text="Home",command=home)
    b2.place(x=15,y=340,width=100,height=40)

    b3=Button(f2,text="Regis",command=regis)
    b3.place(x=480,y=340,width=100,height=40)

def mymenu():
    n=ttk.Notebook()
    n.place(x=0,y=0,width=600,height=400)
    def demo(a):
        if(n.index("current")==5):
            home()
    n.bind("<<NotebookTabChanged>>",demo)
    insertdata(n)
    showalldata(n)
    searchdata(n)
    updatedata(n)
    deletedata(n)
    logoutdata(n)

def insertdata(n):
    s1=StringVar()
    s2=StringVar()
    s3=StringVar()
    s4=StringVar()
    s5=StringVar()
    f4=Frame(bg="#091e42")
    n.add(f4,text="Insert")
    u1=Label(f4,text="Enter Rollno",font=("",11),bg="#091e42",fg="white")
    u1.place(x=200,y=50)
    e1=Entry(font=("",11),textvariable=s1)
    e1.place(x=300,y=70,width=130)

    u2=Label(f4,text="Enter Name",font=("",11),bg="#091e42",fg="white")
    u2.place(x=200,y=100)
    e2=Entry(font=("",11),textvariable=s2)
    e2.place(x=300,y=120,width=130)

    u3=Label(f4,text="Enter Phy",font=("",11),bg="#091e42",fg="white")
    u3.place(x=200,y=150)
    e3=Entry(font=("",11),textvariable=s3)
    e3.place(x=300,y=170,width=130)

    u4=Label(f4,text="Enter Che",font=("",11),bg="#091e42",fg="white")
    u4.place(x=200,y=200)
    e4=Entry(font=("",11),textvariable=s4)
    e4.place(x=300,y=220,width=130)

    u5=Label(f4,text="Enter Maths",font=("",11),bg="#091e42",fg="white")
    u5.place(x=200,y=250)
    e5=Entry(font=("",11),textvariable=s5)
    e5.place(x=300,y=270,width=130) 

    def insertdemo1():
        db=sqlite3.connect('pranjal.db')
        cr=db.cursor()
        cr.execute("insert into ins values('"+s1.get()+"', '"+s2.get()+"' , '"+s3.get()+"' ,'"+s4.get()+"' , '"+s5.get()+"')")
        db.commit()
        db.close()
        messagebox.showinfo('Title','Data Inserted')
        s1.set("")
        s2.set("")
        s3.set("")
        s4.set("")
        s5.set("")
        showalldata1(f55)

    b1=Button(f4,text="Insert",command=insertdemo1)
    b1.place(x=260,y=310,width=80,height=40)

def showalldata(n):
    f5=Frame(bg="#091e42")
    n.add(f5,text="ShowAll")
    global f55 
    f55=f5
    showalldata1(f5)

def showalldata1(f5):
    for w in f5.winfo_children():
        w.destroy()
    u1=Label(f5,text="RNO",font=("",11),bg="#091e42",fg="white")
    u1.place(x=0,y=0,width=120)

    u2=Label(f5,text="Name",font=("",11),bg="#091e42",fg="white")
    u2.place(x=120,y=0,width=120)

    u3=Label(f5,text="PHY",font=("",11),bg="#091e42",fg="white")
    u3.place(x=240,y=0,width=120)

    u4=Label(f5,text="CHE",font=("",11),bg="#091e42",fg="white")
    u4.place(x=360,y=0,width=120)

    u5=Label(f5,text="MATHS",font=("",11),bg="#091e42",fg="white")
    u5.place(x=480,y=0,width=120)

    db=sqlite3.connect('pranjal.db')
    cr=db.cursor()
    r=cr.execute(" select * from ins")
    x=0
    y=60
    for r1 in r:
        Label(f5,text=r1[0],font=("",11),bg="#091e42",fg="white").place(x=x,y=y,width=120)
        x+=120
        Label(f5,text=r1[1],font=("",11),bg="#091e42",fg="white").place(x=x,y=y,width=120)
        x+=120
        Label(f5,text=r1[2],font=("",11),bg="#091e42",fg="white").place(x=x,y=y,width=120)
        x+=120
        Label(f5,text=r1[3],font=("",11),bg="#091e42",fg="white").place(x=x,y=y,width=120)
        x+=120
        Label(f5,text=r1[4],font=("",11),bg="#091e42",fg="white").place(x=x,y=y,width=120)
        y+=40
        x=0
    db.commit()
    db.close()
               
def searchdata(n):
    f6=Frame(bg="#091e42")
    n.add(f6,text="Search")
    s1=StringVar()
    def searchdata1():
        db=sqlite3.connect('pranjal.db')
        cr=db.cursor()
        r1=cr.execute("select *  from ins where URNO= '"+s1.get()+"' ")
        for r in r1:
            u1=Label(f6,text="Name is:",font=("",11),bg="#091e42",fg="white")
            u1.place(x=200,y=100) 
            u2=Label(f6,text=r[1],font=("",11),bg="#091e42",fg="white")
            u2.place(x=300,y=100)
            u3=Label(f6,text="Phy is:",font=("",11),bg="#091e42",fg="white")
            u3.place(x=200,y=150) 
            u4=Label(f6,text=r[2],font=("",11),bg="#091e42",fg="white")
            u4.place(x=300,y=150)
            u5=Label(f6,text="Che is:",font=("",11),bg="#091e42",fg="white")
            u5.place(x=200,y=200) 
            u6=Label(f6,text=r[3],font=("",11),bg="#091e42",fg="white")
            u6.place(x=300,y=200)
            u7=Label(f6,text="Maths is:",font=("",11),bg="#091e42",fg="white")
            u7.place(x=200,y=250) 
            u8=Label(f6,text=r[4],font=("",11),bg="#091e42",fg="white")
            u8.place(x=300,y=250)
            break
        else:
            u9=Label(f6,text="",font=("",11),bg="#091e42",fg="white")
            u9.place(x=200,y=100,width=300) 
            u10=Label(f6,text="",font=("",11),bg="#091e42",fg="white")
            u10.place(x=300,y=100,width=300)
            u11=Label(f6,text="",font=("",11),bg="#091e42",fg="white")
            u11.place(x=200,y=150,width=300) 
            u12=Label(f6,text="",font=("",11),bg="#091e42",fg="white")
            u12.place(x=300,y=150,width=300)
            u13=Label(f6,text="",font=("",11),bg="#091e42",fg="white")
            u13.place(x=200,y=200,width=300) 
            u14=Label(f6,text="",font=("",11),bg="#091e42",fg="white")
            u14.place(x=300,y=200,width=300)
            u15=Label(f6,text="",font=("",11),bg="#091e42",fg="white")
            u15.place(x=200,y=250,width=300) 
            u16=Label(f6,text="",font=("",11),bg="#091e42",fg="white")
            u16.place(x=300,y=250,width=300)
            messagebox.showinfo('Title','Invalid User & Password')

        db.commit()
        db.close()
    u1=Label(f6,text="Enter Rollno",font=("",11),bg="#091e42",fg="white")
    u1.place(x=100,y=50)
    e1=Entry(f6,font=("",11),textvariable=s1)
    e1.place(x=200,y=50,width=130)
    b1=Button(f6,text="Search",font=("",11),command=searchdata1)
    b1.place(x=350,y=50,height=25)
 

def updatedata(n):
    f7=Frame(bg="#091e42")
    n.add(f7,text="Update")
    s1=StringVar()
    u1=Label(f7,text="Enter Rollno",font=("",11),bg="#091e42",fg="white")
    u1.place(x=100,y=50)
    e1=Entry(f7,font=("",11),textvariable=s1)
    e1.place(x=200,y=50,width=130)
    def updatedata1():
        db=sqlite3.connect('pranjal.db')
        cr=db.cursor()
        r1=cr.execute("select *  from ins where URNO= '"+s1.get()+"' ")
        for r in r1:
            s2=StringVar()
            s3=StringVar()
            s4=StringVar()
            s5=StringVar()
            u1=Label(f7,text="Name is:",font=("",11),bg="#091e42",fg="white")
            u1.place(x=200,y=100) 
            u2=Entry(f7,font=("",11),textvariable=s2)
            u2.insert(0,r[1])
            u2.place(x=300,y=100)
            u3=Label(f7,text="Phy is:",font=("",11),bg="#091e42",fg="white")
            u3.place(x=200,y=150) 
            u30=Entry(f7,font=("",11),textvariable=s3)
            u30.insert(0,r[2])
            u30.place(x=300,y=150)
            u4=Label(f7,text="Che is:",font=("",11),bg="#091e42",fg="white")
            u4.place(x=200,y=200) 
            u44=Entry(f7,font=("",11),textvariable=s4)
            u44.insert(0,r[3])
            u44.place(x=300,y=200)
            u5=Label(f7,text="Maths is:",font=("",11),bg="#091e42",fg="white")
            u5.place(x=200,y=250) 
            u55=Entry(f7,font=("",11),textvariable=s5)
            u55.insert(0,r[4])
            u55.place(x=300,y=250)
            def updatedata2():
                     db=sqlite3.connect('pranjal.db')
                     cr=db.cursor()
                     cr.execute("update ins set UPASS= '"+s2.get()+"' ,UPHY= '"+s3.get()+"',UCHE='"+s4.get()+"' , UMATHS='"+s5.get()+"' where URNO='"+s1.get()+"' ")
                     db.commit()
                     db.close()
                     showalldata1(f55)
                     messagebox.showinfo('Title','Data Updated')   
            b11=Button(f7,text="Update",command=updatedata2)
            b11.place(x=250,y=310,width=80,height=40)  
            
            break
        else:
            u9=Label(f7,text="",font=("",11),bg="#091e42",fg="white")
            u9.place(x=200,y=100,width=300) 
            u10=Label(f7,text="",font=("",11),bg="#091e42",fg="white")
            u10.place(x=300,y=100,width=300)
            u11=Label(f7,text="",font=("",11),bg="#091e42",fg="white")
            u11.place(x=200,y=150,width=300) 
            u12=Label(f7,text="",font=("",11),bg="#091e42",fg="white")
            u12.place(x=300,y=150,width=300)
            u13=Label(f7,text="",font=("",11),bg="#091e42",fg="white")
            u13.place(x=200,y=200,width=300) 
            u14=Label(f7,text="",font=("",11),bg="#091e42",fg="white")
            u14.place(x=300,y=200,width=300)
            u15=Label(f7,text="",font=("",11),bg="#091e42",fg="white")
            u15.place(x=200,y=250,width=300) 
            u16=Label(f7,text="",font=("",11),bg="#091e42",fg="white")
            u16.place(x=300,y=250,width=300)
            messagebox.showinfo('Title','Invalid User & Password')

        db.commit()
        db.close()
    b12=Button(f7,text="Update",font=("",11),command=updatedata1)
    b12.place(x=350,y=50,height=25)
    
def deletedata(n):
    f8=Frame(bg="#091e42")
    n.add(f8,text="Delete")
    d1=StringVar()
    u1=Label(f8,text="Enter Rollno",font=("",11),bg="#091e42",fg="white")
    u1.place(x=100,y=50)
    e1=Entry(f8,font=("",11),textvariable=d1)
    e1.place(x=200,y=50,width=130)
    def deletedata1():
        db=sqlite3.connect('pranjal.db')
        cr=db.cursor()
        cr.execute("delete from ins where URNO= '"+d1.get()+"' ")
        db.commit()
        db.close()
        showalldata1(f55)
        messagebox.showinfo('Title','User Data Deleted')
        d1.set("")

    b1=Button(f8,text="Delete",command=deletedata1)
    b1.place(x=350,y=50,height=25) 

def logoutdata(n):
    f9=Frame(bg="#091e42")
    n.add(f9,text="Logout")

def regis():
    r1=StringVar()
    r2=StringVar()
    r3=StringVar()
    f3=Frame(bg="#091e42")
    f3.place(x=0,y=0,width=600,height=400)
    un=Label(f3,text="Enter Name",bg="#091e42",fg="white",font=("",12))
    un.place(x=200,y=50)
    e1=Entry(f3,font=("",11),textvariable=r1)
    e1.place(x=300,y=50,width=130)

    up=Label(f3,text="Enter Pass",bg="#091e42",fg="white",font=("",12))
    up.place(x=200,y=100)
    e2=Entry(f3,font=("",11),show="*",textvariable=r2)
    e2.place(x=300,y=100,width=130)

    def regis1():
        db=sqlite3.connect('pranjal.db')
        cr=db.cursor()
        cr.execute("insert into regis values('"+r1.get()+"', '"+r2.get()+"' , '"+r3.get()+"')")
        db.commit()
        db.close()
        messagebox.showinfo('Title','User Registered')
        r1.set("")
        r2.set("")
        r3.set("")
        print("data inserted..") 

    uc=Label(f3,text="Enter CNO",bg="#091e42",fg="white",font=("",12))
    uc.place(x=200,y=150)
    e3=Entry(f3,font=("",11),textvariable=r3)
    e3.place(x=300,y=150,width=130)

    b1=Button(f3,text="Regis",command=regis1)
    b1.place(x=260,y=210,width=100,height=40)

    b2=Button(f3,text="Home",command=home)
    b2.place(x=15,y=340,width=100,height=40)

    b3=Button(f3,text="Login",command=login)
    b3.place(x=480,y=340,width=100,height=40)

def home():
    f1=Frame(bg="#091e42")
    f1.place(x=0,y=0,width=600,height=400)
    b1=Button(f1,text="Login",command=login)
    b1.place(x=220,y=100,width=80,height=40)
    b2=Button(f1,text="Regis",command=regis)
    b2.place(x=310,y=100,width=80,height=40) 

home()
t.mainloop()