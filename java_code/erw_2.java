/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/*
 * Renamed from erw
 */
public class erw_2 {
    @SerializedName(value="address")
    private String a;
    @SerializedName(value="ports")
    private int[] b;

    public String a() {
        return this.a;
    }

    public int[] b() {
        return (int[])this.b.clone();
    }

    public void a(String string) {
        this.a = string;
    }

    public void a(int ... nArray) {
        this.b = nArray;
    }

    public String toString() {
        return "ProxyServer{m_address='" + this.a + "', m_ports=" + Arrays.toString(this.b) + "}";
    }
}

