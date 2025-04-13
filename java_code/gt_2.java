/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/*
 * Renamed from GT
 */
public class gt_2 {
    @SerializedName(value="@index")
    private String a;
    @SerializedName(value="@timestamp")
    private String b;
    @SerializedName(value="platform")
    private String c;
    @SerializedName(value="service")
    private String d;
    @SerializedName(value="data")
    private gv_2 e;

    public void a(String string) {
        this.a = string;
    }

    public void a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        this.b = simpleDateFormat.format(date);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public void b(String string) {
        this.c = string;
    }

    public void c(String string) {
        this.d = string;
    }

    public gv_2 c() {
        return this.e;
    }

    public void a(gv_2 gv_22) {
        this.e = gv_22;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof gt_2)) {
            return false;
        }
        gt_2 gt_22 = (gt_2)object;
        return Objects.equals(this.b, gt_22.b) && Objects.equals(this.c, gt_22.c) && Objects.equals(this.d, gt_22.d);
    }

    public int hashCode() {
        return Objects.hash(this.b, this.c, this.d);
    }
}

