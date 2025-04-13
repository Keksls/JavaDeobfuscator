/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.AlmanaxEvent
 */
import com.ankama.haapi.client.okhttp.ankama.model.AlmanaxEvent;

/*
 * Renamed from bkf
 */
public class bkf_0 {
    private final String a;
    private final String b;

    public bkf_0(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static bkf_0 a(AlmanaxEvent almanaxEvent) {
        String string = almanaxEvent.getBossName();
        String string2 = almanaxEvent.getBossText();
        return new bkf_0(string, string2);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}

