package inheritance;

public class DmbCellPhoneEX {

	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone();
		
		phone.color = "black";
		phone.model = "�ڹ���";
		phone.channel=7;
		phone.powerOn();
		phone.turnOnDmb();
		phone.changeChannelDmb();
		phone.turnOffDmb();
		phone.bell();
		phone.sendVoice("�ȳ��ϼ���?");
		phone.receiveVoice("�ݰ�����");
		phone.hangUp();
		

	}

}