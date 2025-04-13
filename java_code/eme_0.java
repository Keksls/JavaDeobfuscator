/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from emE
 */
public class eme_0 {
    @MQ(a="subscriptions")
    private List<emf_0> a = new ArrayList<emf_0>();

    public List<emf_0> a() {
        return this.a;
    }

    public void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.a.size());
        for (int k = 0; k < this.a.size(); ++k) {
            emf_0 emf_02 = this.a.get(k);
            dataOutputStream.writeInt(emf_02.a());
            dataOutputStream.writeLong(emf_02.b().getTime());
            dataOutputStream.writeLong(emf_02.c().getTime());
        }
    }

    public void a(DataInputStream dataInputStream) {
        this.a = new ArrayList<emf_0>();
        int n = dataInputStream.readInt();
        for (int k = 0; k < n; ++k) {
            int n2 = dataInputStream.readInt();
            Timestamp timestamp = new Timestamp(dataInputStream.readLong());
            Timestamp timestamp2 = new Timestamp(dataInputStream.readLong());
            emf_0 emf_02 = new emf_0(n2, timestamp, timestamp2);
            this.a.add(emf_02);
        }
    }

    public String toString() {
        return "SubscriptionInformation{m_subscriptions=" + this.a.size() + "}";
    }
}

