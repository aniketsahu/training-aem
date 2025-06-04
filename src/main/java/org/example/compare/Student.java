package org.example.compare;

public class Student implements Comparable<Student>{
    int age;
    int score;
    String name;

    public Student(int age, int score, String name) {
        this.age = age;
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }
}
