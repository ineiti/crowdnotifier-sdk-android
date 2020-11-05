package ch.ubique.n2step.sdk.model;

public class EncryptedVenueVisit {
	private long id;
	private long dayTimestamp;
	private byte[] ephemeralPublicKey;
	private byte[] tag;
	private byte[] encryptedPayload;

	public EncryptedVenueVisit(long id, long dayTimestamp, byte[] ephemeralPublicKey, byte[] tag,
			byte[] encryptedPayload) {
		this.id = id;
		this.dayTimestamp = dayTimestamp;
		this.ephemeralPublicKey = ephemeralPublicKey;
		this.tag = tag;
		this.encryptedPayload = encryptedPayload;
	}

	public long getId() {
		return id;
	}

	public long getDayTimestamp() {
		return dayTimestamp;
	}

	public byte[] getEphemeralPublicKey() {
		return ephemeralPublicKey;
	}

	public byte[] getTag() {
		return tag;
	}

	public byte[] getEncryptedPayload() {
		return encryptedPayload;
	}

	public void setId(long id) {
		this.id = id;
	}

}





