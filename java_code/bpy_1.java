/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * Renamed from bpy
 */
public class bpy_1
implements bpz_1 {
    private final ArrayList<String> a = new ArrayList();

    public bpy_1(String string) {
        try {
            this.a(string);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(exception.getMessage(), exception);
        }
    }

    private void a(String string) {
        String string2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gg_0.c(string), "UTF-8"));
        while ((string2 = bufferedReader.readLine()) != null) {
            if (string2.isEmpty()) continue;
            this.a.add(string2);
        }
        bufferedReader.close();
    }

    @Override
    public String a() {
        return this.a.get(Hw.a(this.a.size()));
    }

    @Override
    public void b() {
        this.a.clear();
    }
}

