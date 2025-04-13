/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutputStream;

/*
 * Renamed from aIR
 */
class air_2 {
    static final byte a = -1;
    static final byte b = 0;
    static final byte c = 1;
    static final byte d = 2;
    static final byte e = 3;
    static final byte f = 4;
    static final byte g = 5;
    static final byte h = 6;
    static final byte i = 7;
    static final byte j = 8;
    byte k;
    int l;
    int m;
    int n;
    byte[] o;
    int p;
    int q;

    air_2() {
    }

    void a(DataOutputStream dataOutputStream) {
        if (this.k == -1) {
            dataOutputStream.writeInt(0);
            return;
        }
        int n = 1;
        if (this.k == 4 || this.k == 6 || this.k == 7 || this.k == 8) {
            n += 4;
        }
        if (this.k == 6 || this.k == 7 || this.k == 8) {
            n += 4;
        }
        if (this.k == 6 || this.k == 8) {
            n += 4;
        }
        if (this.k == 5 || this.k == 7) {
            n += this.q;
        }
        dataOutputStream.writeInt(n);
        dataOutputStream.writeByte(this.k & 0xFF);
        if (this.k == 4 || this.k == 6 || this.k == 7 || this.k == 8) {
            dataOutputStream.writeInt(this.l);
        }
        if (this.k == 6 || this.k == 7 || this.k == 8) {
            dataOutputStream.writeInt(this.m);
        }
        if (this.k == 6 || this.k == 8) {
            dataOutputStream.writeInt(this.n);
        }
        if (this.k == 5 || this.k == 7) {
            dataOutputStream.write(this.o, this.p, this.q);
        }
    }

    public String toString() {
        switch (this.k) {
            case -1: {
                return "KEEP_ALIVE";
            }
            case 0: {
                return "CHOKE";
            }
            case 1: {
                return "UNCHOKE";
            }
            case 2: {
                return "INTERESTED";
            }
            case 3: {
                return "UNINTERESTED";
            }
            case 4: {
                return "HAVE(" + this.l + ")";
            }
            case 5: {
                return "BITFIELD";
            }
            case 6: {
                return "REQUEST(" + this.l + "," + this.m + "," + this.n + ")";
            }
            case 7: {
                return "PIECE(" + this.l + "," + this.m + "," + this.n + ")";
            }
            case 8: {
                return "CANCEL(" + this.l + "," + this.m + "," + this.n + ")";
            }
        }
        return "<UNKNOWN>";
    }
}

