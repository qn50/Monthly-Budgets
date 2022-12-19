import java.util.*;

public class MonthlyBudgets {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        // Ask user to enter total monthly income:
        double TotalMonthlyIncome;
        System.out.print("Please enter your total monthly income: ");
        TotalMonthlyIncome = input.nextInt();
        System.out.println("note: your total expenses should not exceed the monthly income");
        System.out.println("");
        
        
        // Ask user to enter the home rent and maintenance expenses:
        double HomeRentAndMaintenance;
        System.out.print("Enter the home rent and maintenance expenses: ");
        HomeRentAndMaintenance = input.nextInt();
        System.out.println("");

        // Ask user to enter the electricity and gas expenses:
        double ElectricityAndGas ;
        System.out.print("Enter the electricity and gas expenses:  ");
        ElectricityAndGas = input.nextInt();
        System.out.println("");
        
        // Ask user to Enter the water expenses:
        double Water ;
        System.out.print("Enter the water expenses:  ");
        Water = input.nextInt();
        System.out.println("");
       
        // Ask user to enter the phones and interne expenses:
        double PhoneAndIntermet ;
        System.out.print("Enter the phones and interne expenses:  ");
        PhoneAndIntermet = input.nextInt();
        System.out.println("");
    
        //**********************************************************************
        
        // Ask user to enter the car payment and maintenance expenses:
        double CarAndMaintenance ;
        System.out.print("Enter the car payment and maintenance expenses:  ");
        CarAndMaintenance = input.nextInt();
        System.out.println("");
        
        // Ask user to enter the gasoline expenses:
        double Gasoline ;
        System.out.print("Enter the gasoline expenses: ");
        Gasoline = input.nextInt();
        System.out.println("");
        
        //**********************************************************************
        
        // Ask user to enter the supermarkets expenses:
        double Supermarkets ;
        System.out.print("Enter the supermarkets expense: ");
        Supermarkets = input.nextInt();
        System.out.println("");
        
        // Ask user to enter the restaurants expenses:
        double Restaurants ;
        System.out.print("Enter the restaurants expenses: ");
        Restaurants = input.nextInt();
        System.out.println("");
       
        //**********************************************************************
        
        // Ask user to Enter the health insurances expenses:
        double HealthInsurances ;
        System.out.print("Enter the health insurances expenses: ");
        HealthInsurances = input.nextInt();
        System.out.println("");
        
        // Ask user to Enter the pharmacies expenses:
        double Pharmacies ;
        System.out.print("Enter the pharmacies expenses: ");
        Pharmacies = input.nextInt();
        System.out.println("");
        
        //*********************************************************************
        
        // Ask user to Enter the school tuitions expenses:
        double SchoolTuitions;
        System.out.print("Enter the school tuitions expenses: ");
        SchoolTuitions = input.nextInt();
        System.out.println("");
        
        // Ask user to Enter the trainings expenses:
        double Trainings;
        System.out.print("Enter the trainings expenses: ");
        Trainings = input.nextInt();
        System.out.println("");
        
        // Ask user to Enter the books expenses:
        double Books;
        System.out.print("Enter the books expenses: ");
        Books = input.nextInt();
        System.out.println("");
        
        //**********************************************************************
        
        // Ask user to Enter the clothes and shoes expenses:
        double ClothesAndShoes;
        System.out.print("Enter the clothes and shoes expenses: ");
        ClothesAndShoes = input.nextInt();
        System.out.println("");
        
        // Ask user to Enter the hobbies and entertainment expenses:
        double Hobbies;
        System.out.print("Enter the hobbies and entertainment expenses: ");
        Hobbies = input.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //**********************************************************************
        
        //calculates the part of Housing Utilities  :
        
       double HousingUtilities,HousingUtilitiesPercentage ;
       HousingUtilities = (HomeRentAndMaintenance + ElectricityAndGas + Water + PhoneAndIntermet);
       HousingUtilitiesPercentage=(HousingUtilities*100)/(TotalMonthlyIncome);
       //HousingUtilitiesPercentage=(((HousingUtilitiesPercentage*100))/100);     
       double HomeRentAndMaintenancePercentage;
       HomeRentAndMaintenancePercentage=(HomeRentAndMaintenance*100)/(TotalMonthlyIncome);
       double ElectricityAndGasPercentage;
       ElectricityAndGasPercentage= (ElectricityAndGas*100)/(TotalMonthlyIncome);
       double WaterPercentage;
       WaterPercentage = (Water*100)/(TotalMonthlyIncome);
       double PhoneAndIntermetPercentage;
       PhoneAndIntermetPercentage = (PhoneAndIntermet*100)/(TotalMonthlyIncome);
       
       // calculates the part of transportation :
       
       double Transportation,TransportationPercentage ;
       Transportation= (CarAndMaintenance + Gasoline);
       TransportationPercentage= (Transportation*100)/(TotalMonthlyIncome);
       double CarAndMaintenancePercentage;
       CarAndMaintenancePercentage= (CarAndMaintenance*100)/(TotalMonthlyIncome);
       double GasolinePercentage;
       GasolinePercentage = (Gasoline*100)/(TotalMonthlyIncome);
       
       // calculates the part of Food and Supplies:
       
       double FoodAndSupplies,FoodAndSuppliesPercentage;
       FoodAndSupplies = (Supermarkets + Restaurants);
       FoodAndSuppliesPercentage= (FoodAndSupplies*100)/(TotalMonthlyIncome);
       double SupermarketsPercentage;
       SupermarketsPercentage = (Supermarkets*100)/(TotalMonthlyIncome);
       double RestaurantsPercentahe ;
       RestaurantsPercentahe= (Restaurants*100)/(TotalMonthlyIncome);
       
       // calculates the part of Medical:
       double Medical,MedicalPercentage ;
       Medical = (HealthInsurances + Pharmacies);
       MedicalPercentage= (Medical*100)/(TotalMonthlyIncome);
       double HealthInsurancesPercentage ;
       HealthInsurancesPercentage= (HealthInsurances*100)/(TotalMonthlyIncome);
       double PharmaciesPercentage;
       PharmaciesPercentage= (Pharmacies*100)/(TotalMonthlyIncome);
       
       // calculates the part of Education :
       double Education,EducationPercentage;
       Education= (SchoolTuitions + Trainings + Books );
       EducationPercentage= (Education*100)/(TotalMonthlyIncome);
       double SchoolTuitionsPercentage;
       SchoolTuitionsPercentage= (SchoolTuitions*100)/(TotalMonthlyIncome);
       double TrainingsPercentage;
       TrainingsPercentage= (Trainings*100)/(TotalMonthlyIncome);
       double BooksPercentage;
       BooksPercentage= (Books*100)/(TotalMonthlyIncome);
       
       // calculates the part of Personal :
       double Personal,PersonalPercentage;
       Personal= (ClothesAndShoes + Hobbies);
       PersonalPercentage= (Personal*100)/(TotalMonthlyIncome);
       double ClothesAndShoesPercentage;
       ClothesAndShoesPercentage= (ClothesAndShoes*100)/(TotalMonthlyIncome);
       double HobbiesPercentage;
       HobbiesPercentage = (Hobbies*100)/(TotalMonthlyIncome);
       
       // calculates the total expenses and the percentage of the total expenses :
       
       double TotalExpenses,TotalExpensesPercentage;
       TotalExpenses=(HousingUtilities + Transportation + FoodAndSupplies + 
                      Medical + Education + Personal);
       
       TotalExpensesPercentage= (HousingUtilitiesPercentage + TransportationPercentage + 
                  FoodAndSuppliesPercentage + MedicalPercentage + EducationPercentage 
                  + PersonalPercentage );
       
       double Saving ;
       Saving = (TotalMonthlyIncome-TotalExpenses);
       
       //display the results :

        System.out.print("Your detailed spending breakdown are shown here: \n");
        System.out.print("_____________________________________________________________________________________________________________________\n");
        System.out.print("Spending Cateogory                                Expenses1                                Percentage11    \n");
        System.out.print("_____________________________________________________________________________________________________________________\n");
        System.out.printf("Housing Utilities %38.1f %39.2f%%\n",HousingUtilities,HousingUtilitiesPercentage);
        System.out.printf("   Rent and Maintenance %32.1f %39.2f%%\n",HomeRentAndMaintenance,HomeRentAndMaintenancePercentage);
        System.out.printf("   Electricity and Gas  %31.1f %39.2f%%\n",ElectricityAndGas,ElectricityAndGasPercentage);
        System.out.printf("   Water                %31.1f %39.2f%%\n",Water,WaterPercentage);
        System.out.printf("   Phone and Intermet   %31.1f %39.2f%%\n",PhoneAndIntermet,PhoneAndIntermetPercentage);
        System.out.print("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ\n");
        System.out.printf("Transportation    %37.1f %39.2f%%\n",Transportation,TransportationPercentage);
        System.out.printf("   Car Payment and Maintenance    %21.1f %39.2f%%\n",CarAndMaintenance,CarAndMaintenancePercentage);
        System.out.printf("   Gasoline                       %21.1f %39.2f%%\n",Gasoline,GasolinePercentage);
        System.out.print("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ\n");
        System.out.printf("Food and Supplie  %38.1f %39.2f%%\n",FoodAndSupplies,FoodAndSuppliesPercentage);
        System.out.printf("   Supermarkets   %37.1f %39.2f%%\n",Supermarkets,SupermarketsPercentage);
        System.out.printf("   Restaurants    %37.1f %39.2f%%\n",Restaurants,RestaurantsPercentahe);
        System.out.print("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ\n");
        System.out.printf("Medical           %37.1f %39.2f%%\n",Medical,MedicalPercentage);
        System.out.printf("   Health Insurances %34.1f %39.1f%%\n",HealthInsurances,HealthInsurancesPercentage);
        System.out.printf("   Pharmacies     %37.1f %39.2f%%\n",Pharmacies,PharmaciesPercentage);
        System.out.print("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ\n");
        System.out.printf("Education         %37.1f %39.2f%%\n",Education,EducationPercentage);
        System.out.printf("   School Tuitions%37.1f %39.2f%%\n",SchoolTuitions,SchoolTuitionsPercentage);
        System.out.printf("   Trainings      %35.1f %40.1f%%\n",Trainings,TrainingsPercentage);
        System.out.printf("   Books          %37.1f %39.2f%%\n",Books,BooksPercentage);
        System.out.print("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ\n");
        System.out.printf("Personal           %37.1f %39.2f%%\n",Personal,PersonalPercentage);
        System.out.printf("   Clothes and Shoes%35.1f %39.2f%%\n",ClothesAndShoes,ClothesAndShoesPercentage);
        System.out.printf("   Hobbies and Entertainment%27.1f %39.2f%%\n",Hobbies,HobbiesPercentage);
        System.out.print("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ\n");
        System.out.println("Your monthly income = " + TotalMonthlyIncome + " SAR");
        System.out.println("Your total expenses = " + TotalExpenses + " SAR");
        System.out.printf("The percentage of your total expenses = %.2f%%\n" , TotalExpensesPercentage);
        System.out.println("Your savings = " + Saving + " SAR");
     
        



        


    }
    
}