/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fqs
extends fqj
implements abq_1 {
    private static Logger f = Logger.getLogger(fqs.class);
    public static final String TAG = "mapAppearance";
    private fqv g = null;
    private azj_2 h = null;
    private int i;
    private int j;
    private int k;
    private int T;
    private boolean U = false;
    private boolean V = false;
    private boolean W = false;
    private boolean X = false;
    public static final int a = -1156593849;
    public static final int b = -892483530;
    public static final int c = -892483529;
    public static final int d = 3117789;
    public static final int e = 3117790;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.g = (fqv)fyb_02;
            if (this.I instanceof fsS) {
                ((fsS)this.I).setMapBackgroundPixmap(((fqv)fyb_02).getPixmap());
            }
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public azj_2 getModulationColor() {
        return this.h;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.h == azj_22) {
            return;
        }
        this.h = azj_22;
        if (this.I instanceof fsS) {
            ((fsS)this.I).setModulationColor(azj_22);
        }
    }

    public int getStartX() {
        return this.i;
    }

    public void setStartX(int n) {
        this.i = n;
        this.U = true;
        fsS fsS2 = (fsS)this.I;
        if (fsS2 != null) {
            fsS2.setMapBackgroundStartX(this.i);
        }
    }

    public int getEndX() {
        return this.j;
    }

    public void setEndX(int n) {
        this.j = n;
        this.V = true;
        fsS fsS2 = (fsS)this.I;
        if (fsS2 != null) {
            fsS2.setMapBackgroundEndX(this.j);
        }
    }

    public int getStartY() {
        return this.k;
    }

    public void setStartY(int n) {
        this.k = n;
        this.W = true;
        fsS fsS2 = (fsS)this.I;
        if (fsS2 != null) {
            fsS2.setMapBackgroundStartY(this.k);
        }
    }

    public int getEndY() {
        return this.T;
    }

    public void setEndY(int n) {
        this.T = n;
        this.X = true;
        fsS fsS2 = (fsS)this.I;
        if (fsS2 != null) {
            fsS2.setMapBackgroundEndY(this.T);
        }
    }

    @Override
    public void setWidget(fvE fvE2) {
        super.setWidget(fvE2);
        if (fvE2 instanceof fsS) {
            fsS fsS2 = (fsS)fvE2;
            if (this.h != null) {
                fsS2.setModulationColor(this.h);
            }
            if (this.g != null) {
                fsS2.setMapBackgroundPixmap(this.g.getPixmap());
            }
            fsS2.setMapBackgroundStartX(this.i);
            fsS2.setMapBackgroundStartY(this.k);
            fsS2.setMapBackgroundEndX(this.j);
            fsS2.setMapBackgroundEndY(this.T);
        }
    }

    @Override
    public boolean preProcess(int n) {
        if (this.H && this.I instanceof fsS) {
            fsS fsS2 = (fsS)this.I;
            if (this.g != null) {
                fsS2.setMapBackgroundPixmap(this.g.getPixmap());
            }
            fsS2.setMapBackgroundStartX(this.i);
            fsS2.setMapBackgroundStartY(this.k);
            fsS2.setMapBackgroundEndX(this.j);
            fsS2.setMapBackgroundEndY(this.T);
        }
        return super.preProcess(n);
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqs fqs2 = (fqs)fyo2;
        super.copyElement(fqs2);
        if (this.U) {
            fqs2.setStartX(this.i);
        }
        if (this.W) {
            fqs2.setStartY(this.k);
        }
        if (this.V) {
            fqs2.setEndX(this.j);
        }
        if (this.X) {
            fqs2.setEndY(this.T);
        }
        fqs2.setModulationColor(this.h);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.g = null;
        this.h = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1156593849) {
            this.setModulationColor(fze2.a(string));
        } else if (n == -892483530) {
            this.setStartX(Co.c(string));
        } else if (n == -892483529) {
            this.setStartY(Co.c(string));
        } else if (n == 3117789) {
            this.setEndX(Co.c(string));
        } else if (n == 3117790) {
            this.setEndY(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1156593849) {
            this.setModulationColor((azj_2)object);
        } else if (n == -892483530) {
            this.setStartX(Co.c(object));
        } else if (n == -892483529) {
            this.setStartY(Co.c(object));
        } else if (n == 3117789) {
            this.setEndX(Co.c(object));
        } else if (n == 3117790) {
            this.setEndY(Co.c(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

