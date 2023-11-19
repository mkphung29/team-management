package teamManagement;

public class Main {
	public static void main(String[] args) {
		// create new lists for coaches, students, and teams
		CoachList allCoaches = new CoachList();
		StudentList allStudents = new StudentList();
		TeamList allTeams = new TeamList();

		// create AthleticDepartment
		AthleticDepartment Violets = new AthleticDepartment("NYU", allCoaches, allStudents, allTeams);

		// create new coaches and add to coaches list
		Coach headGolfCoach = new Coach(155396, "Brent Johnson", "Golf", "Both", 120000);
		allCoaches.add(headGolfCoach);
		Coach assistantGolfCoach = new Coach(134786, "David Moneymaker", "Golf", "Both", 30000);
		allCoaches.add(assistantGolfCoach);
		Coach womensSoccerCoach = new Coach(123890, "Erica Stryker", "Soccer", "Women", 130000);
		allCoaches.add(womensSoccerCoach);
		Coach mensSoccerCoach = new Coach(196745, "Jason Tyler", "Soccer", "Men", 130000);
		allCoaches.add(mensSoccerCoach);
		Coach womensBasketballCoach = new Coach(187332, "Frankie James", "Basketball", "Women", 110000);
		allCoaches.add(womensBasketballCoach);
		Coach mensBasketballCoach = new Coach(169900, "Cary Unger", "Basketball", "Men", 110000);
		allCoaches.add(mensBasketballCoach);
		Coach volleyballCoach = new Coach(144886, "Jessica Wembley", "Volleyball", "Women", 150000);
		allCoaches.add(volleyballCoach);
		Coach baseballCoach = new Coach(125775, "Kyle Oliver", "Baseball", "Men", 130000);
		allCoaches.add(baseballCoach);
		Coach softballCoach = new Coach(164378, "Laura Peterson", "Softball", "Women", 130000);
		allCoaches.add(softballCoach);
		
		// create new students and add to students list
		Student student1 = new Student(198876, "Henry Walker", "Golf", "Senior", "Male");
		allStudents.add(student1);
		Student student2 = new Student(198877, "Ashley Park", "Golf", "Junior", "Female");
		allStudents.add(student2);
		Student student3 = new Student(198878, "Summer Yang", "Golf", "Senior", "Female");
		allStudents.add(student3);
		Student student4 = new Student(198879, "Rohan Arrebolu", "Golf", "Sophomore", "Male");
		allStudents.add(student4);
		Student student5 = new Student(198880, "Kelsey Chan", "Soccer", "Freshman", "Female");
		allStudents.add(student5);
		Student student6 = new Student(198881, "Alan Kingston", "Soccer", "Sophomore", "Male");
		allStudents.add(student6);
		Student student7 = new Student(198882, "Helen Frank", "Basketball", "Senior", "Female");
		allStudents.add(student7);
		Student student8 = new Student(198883, "Chase Watson", "Basketball", "Junior", "Male");
		allStudents.add(student8);
		Student student9 = new Student(198884, "Jason Henry", "Baseball", "Freshman", "Male");
		allStudents.add(student9);
		Student student10 = new Student(198885, "Jillian Kostenbauder", "Softball", "Junior", "Female");
		allStudents.add(student10);
		Student student11 = new Student(198886, "Francis Bacon", "Basketball", "Sophomore", "Male");
		allStudents.add(student11);
		
		// create new teams and add to teams list
		Team golfTeam = new Team("Golf", 4, 2, 2, 300000);
		allTeams.add(golfTeam);
		Team soccerTeam = new Team("Soccer", 2, 1, 1, 200000);
		allTeams.add(soccerTeam);
		Team basketballTeam = new Team("Basketball", 3, 2, 1, 200000);
		allTeams.add(basketballTeam);
		Team volleyballTeam = new Team("Volleyball", 1, 0, 1, 100000);
		allTeams.add(volleyballTeam);
		Team baseballTeam = new Team("Baseball", 1, 1, 0, 300000);
		allTeams.add(baseballTeam);
		Team softballTeam = new Team("Softball", 1, 0, 1, 300000);
		allTeams.add(softballTeam);
		
		// set total budget for Violets Athletic Department
		Violets.setTotalBudget(1000000);
		System.out.println("The budget for the athletic department is $" + Violets.getTotalBudget());

		// get the money spent by Violets
		double moneySpent = Violets.getMoneySpent();
		System.out.println("The athletic department spent a total of $" + moneySpent);

		// get the highest paid Coach
		Coach highestPaid = allCoaches.getHighestPaid();
		System.out.println("Highest paid coach: " + highestPaid.toString());

		// get the lowest paid Coach
		Coach lowestPaid = allCoaches.getLowestPaid();
		System.out.println("Lowest paid coach: " + lowestPaid.toString());

		// get the list of golf coaches
		CoachList allGolf = allCoaches.getAllTeam("Golf");
		System.out.println("Here is the list of golf coaches: ");
		for (Coach c : allGolf){
			System.out.println(c.toString());
		}

		// get the list of coaches for all female teams
		CoachList allWomensTeams = allCoaches.getAllGender("Women");
		System.out.println("Here is the list of all coaches who coach women's teams: ");
		for (Coach c : allWomensTeams){
			System.out.println(c.toString());
		}

		// get all of the mens teams
		TeamList allMensSports = allTeams.getMensTeams();
		System.out.println("Here is the list of all men's sports: ");
		for (Team t : allMensSports){
			System.out.println(t.toString());
		}

		// get all of the womens teams
		TeamList allWomensSports = allTeams.getWomensTeams();
		System.out.println("Here is the list of all women's sports: ");
		for (Team t : allWomensSports){
			System.out.println(t.toString());
		}

		// get all of the students that play golf
		StudentList allGolfAthletes = allStudents.getAllSport("Golf");
		System.out.println("Here are all students that play golf: ");
		for (Student s : allGolfAthletes){
			System.out.println(s.toString());
		}

		// get all of the students that are seniors
		StudentList allSeniors = allStudents.getAllYear("Senior");
		System.out.println("Here are all students that are seniors: ");
		for(Student s : allSeniors){
			System.out.println(s.toString());
		}

		// get all students that men
		StudentList allMaleAthletes = allStudents.getAllGender("Male");
		System.out.println("Here are all male athletes: ");
		for (Student s : allMaleAthletes){
			System.out.println(s.toString());
		}

	}
}
