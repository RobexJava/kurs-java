public class Man {

    private int age;

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Man man = new Man(22);

        String securityAnswer;

        if (man.getAge() >= 18) {
            securityAnswer = "��� � �������, ���������!";
        } else {
            securityAnswer = "���� ����� �� �������� ��� ������ ��������!";
        }

        System.out.println(securityAnswer);

    }
}
