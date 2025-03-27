## Hospital Management System

> Learning Management System ရဲ့ ရည်ရွယ်ချက်ကတော့ Learner တွေ ပညာသင်ကြားနိုင်ပြီး Instructorများ lectureတွေ သင်ကြားပိုချနိုင်တဲ့ platform တစ်ခုဖြစ်ပါတယ်

 ---------------------------------

ဒီ System ကို front-end နှင့် back-end ခွဲရေးခဲ့ပြီး အခု project ကိုတော့ back-end အနေနှင့် API endpoint ကို Java ဖြင့်ရေးခဲ့ကြပါတယ်

Tech Stack
- [API](https://lms-java-production.up.railway.app/) - Spring Boot, Java, MySQL

ဒီ project ရဲ့ Reposirtory လေးကိုတော့ ဒီ [Link](https://github.com/one-project-one-month/lms-java.git) ကနေ ကြည့်လိုရပါတယ်

---------------------------------

LMS တွင် ပါဝင်သော Table များ

1. User
2. Student
3. Instructor
4. Admin
5. Role
6. Token
7. Category
8. Enrollment
9. Course
10. Lesson
11. Social Link

## Contributors

### Java Team
<table>
 <thead>
  <tr>
   <th colspan="12">Contributors</th>
  </tr>
 </thead>
    <tbody>
        <tr>
           <td><a href="https://github.com/thanthtooaung-coding"><img src="https://avatars.githubusercontent.com/u/148937860?v=4" width="60px;"/></a></td>
           <td><a href="https://github.com/GerVaf"><img src="https://github.com/GerVaf.png" width="60px;"/></a></td>
           <td><a href="https://github.com/Kaung-Myat-Hun"><img src="https://github.com/Kaung-Myat-Hun.png" width="60px;"/></a></td>
        </tr>
    </tbody>
</table>

Description

Hospital Management System ကို ကိုလင်းရဲ့ ဦးဆောင်မှုဖြင့် စတင်ခဲ့ပြီး တစ်လအတွင်းပြီးနိုင်‌‌လောက်သည်အထိ scope သတ်မှတ်ခဲ့ပါတယ်။ HMS က ဆေးရုံရဲ့ လုပ်ငန်းဆောင်တာအချို့ကို လုပ်ဆောင်ရမှာ လွယ်ကူစေရန် ရည်ရွယ်ခဲ့ပါတယ်။ HMS တွင် လူနာတွေရဲ့ အချက်အလက်တွေ၊ ဆရာဝန်‌တွေရဲ့ အချက်အလက်‌ တွေ၊ သိမ်းဆည်းထားနိုင်ပြီး လျှင်မြန်စွာ ရှာဖွေကြည့်ရှုနိုင်ပါတယ်။ HMS တွင် လူနာအချက်အသစ်လုပ်ခြင်း၊ လူနာအချက်အလက်ပြင်ဆင်ခြင်းစတဲ့ patient management ကို လွယ်ကူစွာလုပ်ဆောင်နိုင်ပါတယ်။ ဆရာဝန်နှင့် ပြသလိုလျှင်လည်း ရက်ချိန်းများလည်း လုပ်ဆောင်နိုင်ပါသည်။

### Doctor
> ဆရာဝန်ရဲ့ အချက်အလက်များ သိမ်းရန်၊ Patient နဲ့ Appointment ချိတ်ဆက်ပေးရန်

 Id Int
 DoctorName    String
 Email         String
 MobileNumber  String
 SpecialistId  Int            
 StartDuty     String
 EndDuty       String

### Patient
> လူနာတွေရဲ့ အချက်အလက်များသိမ်းရန်၊ Doctor နဲ့ Appointment ချိတ်ဆက်ပေးရန်

  Id            Int    
  Name          String   
  Gender        String 
  PhoneNumber   String   
  Email         String   
  BloodType     String  
  BirthDate     DateTime  
  Address       String

### Appointment
> Appointment data သိမ်းရန်၊ Doctor နဲ့ Patient ချိတ်ဆက်ပေးရန်

  Id              Int  
  PatientId       Int
  DoctorId        Int
  AppointmentDate DateTime
  RoomId          Int
  TokenId         String 
  Status          String  
  IsCancel        Boolean

### Medical Record
> လူနာရဲ့ ဆေးအချက်အလက်မှတ်တမ်းသိမ်းဆည်းရန်၊ Disease နဲ့ Patient ချိတ်ဆက်ပေးရန် 
  Id        Int   
  Patient   Patient 
  PatientID Int   
  StartDate DateTime
  EndDate   DateTime
  Diagnosis String
  Note      String
  Treatment String

### Disease
> ရောဂါ အချက်အလက်သိမ်းဆည်းရန်၊ Medical Record တွင် Patient နဲ့ ချိတ်ဆက်ရန်
  Id             Int   
  Name           String
 

### Specialist
> အထူးပြု ရောဂါကုသသော အချက်လက်ကိုသိမ်းဆည်းရန်၊ Doctor နဲ့ ချိတ်ဆက်ရန်
  Id    Int   
  Name  String
  Description String

### Room
> အခန်းသိမ်းဆည်းရန်၊ Appointment တွင် Doctor နဲ့ Patient အားချိတ်ရန်
  Id    Int   
  Name  String
