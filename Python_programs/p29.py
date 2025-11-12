#create a class time with private attributes hours, minutes and seconds.Overload '+' operator to find sum of 2 time
class Time:
    def __init__(self,hour,minute,second):
        self.__hour=hour
        self.__minute=minute
        self.__second=second
    def display(self):
        print(f"{self.__hour:02d}:{self.__minute:02d}:{self.__second:02d}")
    def __add__(self,other):
        total_seconds=self.__second + other.__second
        carry_minute=total_seconds//60
        seconds=total_seconds%60
        total_minutes=self.__minute + other.__minute + carry_minute
        carry_hour=total_minutes//60
        minutes=total_minutes%60
        hours=(self.__hour + other.__hour + carry_hour)%24
        return Time(hours,minutes,seconds)
    
t1=Time(2,45,50)
t2=Time(1,20,30)
t3=t1+t2
print("Time 1:",end=" ")
t1.display()
print("Time 2:",end=" ")
t2.display()
print("Sum of Time 1 and Time 2:",end=" ")
t3.display()
