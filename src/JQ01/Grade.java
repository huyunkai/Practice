package JQ01;

public enum Grade {
	Mon("Monday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "����һ";
		}
		},
		Tue("Tuesday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "���ڶ�";
		}
		},
		Wed("Wednesday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "������";
		}
		},
		Thu("Thursday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "������";
		}
		},
		Fri("Friday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "������";
		}
		},
		Sat("Saturday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "������";
		}
		},
		Sun("Sunday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "������";
		}
		}, ;
		private String value;
		private Grade(String value)
		{
			this.value=value;
		}
		public String getValue()
		{
		return value;
		}
		public abstract  String toLocalGrade();
}
