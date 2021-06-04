package mediator.ejercicio;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalDeComunicacion {
	private HashMap<Integer, Colleague> personasChat = new HashMap<>();

	public void addPersonasAlChat(Colleague persona) {
		personasChat.put(persona.getCi(), persona);
	}

	@Override
	public void send(String message, Colleague colleague) {
		for (Map.Entry<Integer, Colleague> entry : personasChat.entrySet()) {
			if (colleague.getCi() != entry.getKey().intValue()) {
				if (colleague instanceof SM) {
					entry.getValue().messageReceived(message);
				}
				if (colleague instanceof QA && entry.getValue() instanceof QA) {
					entry.getValue().messageReceived(message);
				}
				if (colleague instanceof DEV && entry.getValue() instanceof DEV) {
					entry.getValue().messageReceived(message);
				}
			}
		}
	}

}
