/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

/*
 * Renamed from arX
 */
class arx_1 {
    public final int a;
    public int b;
    public int c;
    public final File d;
    final /* synthetic */ art_1 e;

    public arx_1(art_1 art_12, int n, int n2, int n3, int n4) {
        this.e = art_12;
        this.a = n2;
        this.b = n3;
        this.c = n4;
        art_12.m.setLength(0);
        String string = art_12.m.append(art_12.h).append("data.").append(n).append("_").append(this.a).append(".bdat").toString();
        File file = (File)art_12.u.get(string.hashCode());
        if (file != null) {
            this.d = file;
        } else {
            this.d = new File(string);
            art_12.u.put(string.hashCode(), (Object)this.d);
        }
    }
}

