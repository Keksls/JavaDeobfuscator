/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAm
 */
class aam_2
implements Runnable {
    final /* synthetic */ aai_2 a;
    final /* synthetic */ aal_2 b;

    aam_2(aal_2 aal_22, aai_2 aai_22) {
        this.b = aal_22;
        this.a = aai_22;
    }

    @Override
    public void run() {
        while (true) {
            String string;
            if ((string = this.b.b.a()) != null && !string.isEmpty()) {
                String string2 = string.split("\\(")[0];
                if (string2.equals("glClear")) {
                    this.a.c();
                }
                this.a.a(string2);
                continue;
            }
            try {
                Thread.sleep(this.b.d);
                continue;
            }
            catch (InterruptedException interruptedException) {
                aal_2.a.error((Object)"Interrupted ", (Throwable)interruptedException);
                continue;
            }
            break;
        }
    }
}

