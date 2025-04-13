/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/*
 * Renamed from Hi
 */
public class hi_2 {
    @SerializedName(value="skin_color")
    private final String a;
    @SerializedName(value="hair_color")
    private final String b;
    @SerializedName(value="pupil_color")
    private final String c;
    @SerializedName(value="costume_color1")
    private final String d;
    @SerializedName(value="costume_color2")
    private final String e;
    @SerializedName(value="costume_color3")
    private final String f;
    @SerializedName(value="costume_color4")
    private final String g;
    @SerializedName(value="costume_color5")
    private final String h;
    @SerializedName(value="costume_color6")
    private final String i;
    @SerializedName(value="cloth_index")
    private final int j;
    @SerializedName(value="face_index")
    private final int k;

    public hi_2(int n, int n2, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = string7;
        this.h = string8;
        this.i = string9;
        this.j = n;
        this.k = n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        hi_2 hi_22 = (hi_2)object;
        return this.hashCode() == hi_22.hashCode();
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}

