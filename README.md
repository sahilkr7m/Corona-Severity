# Corona-Severity

The project is useful in determining the severity of corona in a patient , that is , what is the seriousness of disease in the patients body and will characterise it as , low risk , moderate , high risk and will also be telling whether the patient needs hospitalization or not.
The determination of severity is on the basis of certain characteristics , which are broadly divided into 3 categories.
.BMI of the patient 
.Patient Details 
.Inflammatory details.
All of these 3 categories are medically assigned certain points if they full fill the conditions as mentioned . 
In the final state , the sum of these points will lead to determine the severity of corona 

if total point<6 ----->low risk
If total points >6 and <=14--moderate risk , hospitalization can be required
If total points >14 -high risk , hospitalization must.

BMI class


The BMI class is supposed to ask for the parameters such as height and weight of the patient and will calculate the BMI of the patient.
According to the BMI obtained the system will assign certain points .
If BMI >=25 AND <30 --2 POINTS
If BMI >=30 -----3 points

--------------------------

Invalid input exception class

This is universal class to apply wherever there is invalid input given.

--------------------------

Patient-details class

This class will take the required patient details .
If the patient details match with the conditions , some points will be assigned.

Points -:
If age>65-------1.5 points
If gender=male------3 points


-------------------------

Medical parameters

This class will take the required medical parameters as input .
Which are:-
Dyspnea 
Inflammatory Parameters 
Neutrophil count
Lymphocyte count
CRP 

Points criteria :-
If patient is suffering from shortness of breath(dyspnea) ---3.5 points.
If neutrophil count >8000perUL --3 points
If lymphocyte count<1000perUL--1.5
CRP>=100 and <200mg/l---2 points
CRP>=200 ----5.5 Points

-----------------------
Main class

The main class consists of all the objects required to execute the functions and also consists of main points which will determine the severity.
If total points <=6 ---low risk
If total points >6 and <=14--moderate risk , hospitalization can be required
If total points >14 -high risk , hospitalization must.

----------------------


###############################   THANKYOU   #########################################
