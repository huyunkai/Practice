package JQ01;

public enum Grade {
	Mon("Monday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "星期一";
		}
		},
		Tue("Tuesday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "星期二";
		}
		},
		Wed("Wednesday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "星期三";
		}
		},
		Thu("Thursday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "星期四";
		}
		},
		Fri("Friday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "星期五";
		}
		},
		Sat("Saturday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "星期六";
		}
		},
		Sun("Sunday") {
		@Override
		public String toLocalGrade() {
		// TODO Auto-generated method stub
		return "星期日";
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
