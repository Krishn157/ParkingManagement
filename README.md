
# Output

### Main Menu

After clicking on run, this is the main menu which displays on the screen.

It has 7 options:

```
1.) Park your vehicle
2.) Unpark your vehicle
3.) Display List of vehicles parked
4.) Display Statistics
5.) Display Price Chart
6.) Search for a vehicle by rto_no.
7.) Exit (to exit the program).
```
The options i.e.)

```
1.) Park your vehicle.
2.) Unpark your vehicle.
3.) Search for a vehicle by RTO number.
```
are accessible to the user, while rest of the options will require admin access.
The admin access is only granted after entering a secured login key in the
system.

![image-000](https://user-images.githubusercontent.com/47914919/124636474-34ff0e00-dea6-11eb-9834-ae5ab8d78d5f.jpg)



### Park your vehicle.

After selecting option 1 in main menu, following form appears in the console.

This option is used to register a new user and vehicle into the system.

The following options are asked from the user:

```
1.) Username
2.) User email.
3.) User address.
4.) Vehicle details such as RTO number, brand, vehicle color, vehicle
mileage, vehicle type, number of seats, fuel type.
```
After providing all the above details, a unique id is generated for the user( to
identify user later and also enhance privacy of user ) and an id is also generated
for the parking lot provided to the user( this parking lot id will be used to search
parking lot of a specific user). These unique ids provide us with data security
for user as well as act as a search base for the vehicle.

![image-001](https://user-images.githubusercontent.com/47914919/124636639-65df4300-dea6-11eb-98ed-671c3f93f6c9.jpg)



### Unpark your vehicle

This option is used to unpark a vehicle. The operator is prompted to enter the
following details:

```
1.) Username
2.) Vehicle Type
3.) RTO number.
```
Then the validation of the details is done. After successful validation, parking
fees is paid by the user to the operator, and after that parking space previously
allocated to the user is made free for further use.

![image-002](https://user-images.githubusercontent.com/47914919/124636720-7c859a00-dea6-11eb-8531-03af21e2080e.jpg)



### Display List of vehicles parked

As this option requires admin access, the operator is prompted to enter the
admin password.

The display has 3 categories.

```
1.) List of cars parked.
2.) List of bikes parked.
3.) List of vans parked.
```
The output contains the following information about a vehicle.

```
1.) Owned by (unique id is used for data privacy).
2.) Brand.
3.) Color.
```

![image-003](https://user-images.githubusercontent.com/47914919/124636803-92935a80-dea6-11eb-8af2-450b25a0263f.jpg)


### Display Statistics

This option also requires admin access. Therefore, the operator is prompted to
enter the admin password.

This option is used to display the real-time statistics of the smart parking
system. It contains the following details:

```
1.) Total capacity of parking lot.
2.) Total number of car parking available.
3.) Total number of bike parking available.
4.) Total number of van parking available.
5.) Number of car parking’s occupied.
6.) Number of bike parking’s occupied.
7.) Number of van parking’s occupied.
```
After seeing the statistics the operator can return to the main menu after
pressing any button.

![image-004](https://user-images.githubusercontent.com/47914919/124636845-a212a380-dea6-11eb-9de4-5e776ac2650b.jpg)



### Display price chart

This option can only be accessed by the admin. It requires an admin password
to enter into this function of the system.

This option can be used by used by the admin to show price chart details to the
user during the registration process. It displays the following details:

```
1.) Parking rate for car (Rs. 40/hr.)
2.) Parking rate for van (Rs. 40/hr.)
3.) Parking rate for bike (Rs. 40/hr.)
```

![image-005](https://user-images.githubusercontent.com/47914919/124636882-ad65cf00-dea6-11eb-8043-26e59927a505.jpg)

### Search for a vehicle by RTO number.

This option is used to search for a vehicle in the parking lot.

By this function run time polymorphism has been implemented. Search is
accessible to both admin and user. Admin can search for any vehicle, where as
user can search only for his own vehicle.


* Search by User:

It requires the following details from the user.

```
1.) Username (whose vehicle is to be searched)
2.) Vehicle type (car/ bike/ van)
3.) Vehicle RTO number.
```
Then the validation of these inputs is done and if any of the following condition
fails user id denied access:

```
1.) Username should be valid.
2.) User should have that vehicle type parked.
3.) User’s RTO number should be valid and saved in the database.
```

![image-006](https://user-images.githubusercontent.com/47914919/124636965-c7071680-dea6-11eb-94e9-9512d11ff054.jpg)

If user tries to find the details of any other vehicle which is not owned by him,
then access is denied with an error message as shown below.

![image-007](https://user-images.githubusercontent.com/47914919/124637016-d6865f80-dea6-11eb-9865-5e0463323034.jpg)

* Search by Admin:

It requires the following details from the admin.

```
1.) Username should be entered as admin
2.) Admin password
3.) Vehicle type (car/ bike/ van)
4.) Vehicle RTO number.
```
Then the validation of these inputs is done and if any of the following condition
fails user id denied access:

```
1.) Admin password should be valid
2.) A vehicle with that RTO number should be valid and saved in the
database.
```

![image-008](https://user-images.githubusercontent.com/47914919/124637070-e56d1200-dea6-11eb-9712-44d8a30c4f4a.jpg)

If admin tries to search for a vehicle that is not parked in the parking lot. Then
an appropriate message is displayed.

![image-009](https://user-images.githubusercontent.com/47914919/124637115-f3229780-dea6-11eb-9b04-f517c85eb433.jpg)






