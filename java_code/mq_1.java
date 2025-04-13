/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from mQ
 */
public final class mq_1
extends GeneratedMessageV3
implements mT {
    private static final long q = 0L;
    int r;
    public static final int a = 1;
    long s;
    public static final int b = 2;
    int t;
    public static final int c = 3;
    long u;
    public static final int d = 4;
    volatile Object v;
    public static final int e = 5;
    int w;
    public static final int f = 6;
    int x;
    public static final int g = 7;
    long y;
    public static final int h = 8;
    int z;
    public static final int i = 9;
    int A;
    public static final int j = 10;
    long B;
    public static final int k = 11;
    int C;
    public static final int l = 12;
    List<Integer> D;
    public static final int m = 13;
    boolean E;
    public static final int n = 14;
    int F;
    public static final int o = 15;
    int G;
    private byte H = (byte)-1;
    private static final mq_1 I = new mq_1();
    @Deprecated
    public static final Parser<mq_1> p = new mr_0();

    mq_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mq_1() {
        this.s = 0L;
        this.t = 0;
        this.u = 0L;
        this.v = "";
        this.w = 0;
        this.x = -1;
        this.y = 0L;
        this.z = 0;
        this.A = 0;
        this.B = 0L;
        this.C = 0;
        this.D = Collections.emptyList();
        this.E = false;
        this.F = 0;
        this.G = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mq_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block25: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block25;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block25;
                        bl = true;
                        continue block25;
                    }
                    case 8: {
                        this.r |= 1;
                        this.s = codedInputStream.readInt64();
                        continue block25;
                    }
                    case 16: {
                        this.r |= 2;
                        this.t = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 24: {
                        this.r |= 4;
                        this.u = codedInputStream.readInt64();
                        continue block25;
                    }
                    case 34: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.r |= 8;
                        this.v = byteString;
                        continue block25;
                    }
                    case 40: {
                        this.r |= 0x10;
                        this.w = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 48: {
                        this.r |= 0x20;
                        this.x = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 56: {
                        this.r |= 0x40;
                        this.y = codedInputStream.readInt64();
                        continue block25;
                    }
                    case 64: {
                        this.r |= 0x80;
                        this.z = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 72: {
                        this.r |= 0x100;
                        this.A = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 80: {
                        this.r |= 0x200;
                        this.B = codedInputStream.readInt64();
                        continue block25;
                    }
                    case 88: {
                        this.r |= 0x400;
                        this.C = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 96: {
                        if ((n & 0x800) != 2048) {
                            this.D = new ArrayList<Integer>();
                            n |= 0x800;
                        }
                        this.D.add(codedInputStream.readInt32());
                        continue block25;
                    }
                    case 98: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 0x800) != 2048 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.D = new ArrayList<Integer>();
                            n |= 0x800;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.D.add(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block25;
                    }
                    case 104: {
                        this.r |= 0x800;
                        this.E = codedInputStream.readBool();
                        continue block25;
                    }
                    case 112: {
                        this.r |= 0x1000;
                        this.F = codedInputStream.readInt32();
                        continue block25;
                    }
                    case 120: 
                }
                this.r |= 0x2000;
                this.G = codedInputStream.readInt32();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 0x800) == 2048) {
                this.D = Collections.unmodifiableList(this.D);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return mo_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mo_0.d.ensureFieldAccessorsInitialized(mq_1.class, mS.class);
    }

    @Override
    public boolean b() {
        return (this.r & 1) == 1;
    }

    @Override
    public long c() {
        return this.s;
    }

    @Override
    public boolean d() {
        return (this.r & 2) == 2;
    }

    @Override
    public int e() {
        return this.t;
    }

    @Override
    public boolean f() {
        return (this.r & 4) == 4;
    }

    @Override
    public long g() {
        return this.u;
    }

    @Override
    public boolean h() {
        return (this.r & 8) == 8;
    }

    @Override
    public String i() {
        Object object = this.v;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.v = string;
        }
        return string;
    }

    @Override
    public ByteString j() {
        Object object = this.v;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.v = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean k() {
        return (this.r & 0x10) == 16;
    }

    @Override
    public int l() {
        return this.w;
    }

    @Override
    public boolean m() {
        return (this.r & 0x20) == 32;
    }

    @Override
    public int n() {
        return this.x;
    }

    @Override
    public boolean o() {
        return (this.r & 0x40) == 64;
    }

    @Override
    public long p() {
        return this.y;
    }

    @Override
    public boolean q() {
        return (this.r & 0x80) == 128;
    }

    @Override
    public int r() {
        return this.z;
    }

    @Override
    public boolean s() {
        return (this.r & 0x100) == 256;
    }

    @Override
    public int t() {
        return this.A;
    }

    @Override
    public boolean u() {
        return (this.r & 0x200) == 512;
    }

    @Override
    public long v() {
        return this.B;
    }

    @Override
    public boolean w() {
        return (this.r & 0x400) == 1024;
    }

    @Override
    public int x() {
        return this.C;
    }

    @Override
    public List<Integer> y() {
        return this.D;
    }

    @Override
    public int z() {
        return this.D.size();
    }

    @Override
    public int a(int n) {
        return this.D.get(n);
    }

    @Override
    public boolean A() {
        return (this.r & 0x800) == 2048;
    }

    @Override
    public boolean B() {
        return this.E;
    }

    @Override
    public boolean C() {
        return (this.r & 0x1000) == 4096;
    }

    @Override
    public int D() {
        return this.F;
    }

    @Override
    public boolean E() {
        return (this.r & 0x2000) == 8192;
    }

    @Override
    public int F() {
        return this.G;
    }

    public final boolean isInitialized() {
        byte by = this.H;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.d()) {
            this.H = 0;
            return false;
        }
        if (!this.f()) {
            this.H = 0;
            return false;
        }
        if (!this.h()) {
            this.H = 0;
            return false;
        }
        if (!this.o()) {
            this.H = 0;
            return false;
        }
        if (!this.q()) {
            this.H = 0;
            return false;
        }
        if (!this.s()) {
            this.H = 0;
            return false;
        }
        this.H = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.r & 1) == 1) {
            codedOutputStream.writeInt64(1, this.s);
        }
        if ((this.r & 2) == 2) {
            codedOutputStream.writeInt32(2, this.t);
        }
        if ((this.r & 4) == 4) {
            codedOutputStream.writeInt64(3, this.u);
        }
        if ((this.r & 8) == 8) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.v);
        }
        if ((this.r & 0x10) == 16) {
            codedOutputStream.writeInt32(5, this.w);
        }
        if ((this.r & 0x20) == 32) {
            codedOutputStream.writeInt32(6, this.x);
        }
        if ((this.r & 0x40) == 64) {
            codedOutputStream.writeInt64(7, this.y);
        }
        if ((this.r & 0x80) == 128) {
            codedOutputStream.writeInt32(8, this.z);
        }
        if ((this.r & 0x100) == 256) {
            codedOutputStream.writeInt32(9, this.A);
        }
        if ((this.r & 0x200) == 512) {
            codedOutputStream.writeInt64(10, this.B);
        }
        if ((this.r & 0x400) == 1024) {
            codedOutputStream.writeInt32(11, this.C);
        }
        for (int k = 0; k < this.D.size(); ++k) {
            codedOutputStream.writeInt32(12, this.D.get(k).intValue());
        }
        if ((this.r & 0x800) == 2048) {
            codedOutputStream.writeBool(13, this.E);
        }
        if ((this.r & 0x1000) == 4096) {
            codedOutputStream.writeInt32(14, this.F);
        }
        if ((this.r & 0x2000) == 8192) {
            codedOutputStream.writeInt32(15, this.G);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.r & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.s);
        }
        if ((this.r & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.t);
        }
        if ((this.r & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.u);
        }
        if ((this.r & 8) == 8) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.v);
        }
        if ((this.r & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.w);
        }
        if ((this.r & 0x20) == 32) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.x);
        }
        if ((this.r & 0x40) == 64) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.y);
        }
        if ((this.r & 0x80) == 128) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.z);
        }
        if ((this.r & 0x100) == 256) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.A);
        }
        if ((this.r & 0x200) == 512) {
            n += CodedOutputStream.computeInt64Size((int)10, (long)this.B);
        }
        if ((this.r & 0x400) == 1024) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.C);
        }
        int n2 = 0;
        for (int k = 0; k < this.D.size(); ++k) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.D.get(k));
        }
        n += n2;
        n += 1 * this.y().size();
        if ((this.r & 0x800) == 2048) {
            n += CodedOutputStream.computeBoolSize((int)13, (boolean)this.E);
        }
        if ((this.r & 0x1000) == 4096) {
            n += CodedOutputStream.computeInt32Size((int)14, (int)this.F);
        }
        if ((this.r & 0x2000) == 8192) {
            n += CodedOutputStream.computeInt32Size((int)15, (int)this.G);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mq_1)) {
            return super.equals(object);
        }
        mq_1 mq_12 = (mq_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == mq_12.b();
        if (this.b()) {
            bl = bl && this.c() == mq_12.c();
        }
        boolean bl3 = bl = bl && this.d() == mq_12.d();
        if (this.d()) {
            bl = bl && this.e() == mq_12.e();
        }
        boolean bl4 = bl = bl && this.f() == mq_12.f();
        if (this.f()) {
            bl = bl && this.g() == mq_12.g();
        }
        boolean bl5 = bl = bl && this.h() == mq_12.h();
        if (this.h()) {
            bl = bl && this.i().equals(mq_12.i());
        }
        boolean bl6 = bl = bl && this.k() == mq_12.k();
        if (this.k()) {
            bl = bl && this.l() == mq_12.l();
        }
        boolean bl7 = bl = bl && this.m() == mq_12.m();
        if (this.m()) {
            bl = bl && this.n() == mq_12.n();
        }
        boolean bl8 = bl = bl && this.o() == mq_12.o();
        if (this.o()) {
            bl = bl && this.p() == mq_12.p();
        }
        boolean bl9 = bl = bl && this.q() == mq_12.q();
        if (this.q()) {
            bl = bl && this.r() == mq_12.r();
        }
        boolean bl10 = bl = bl && this.s() == mq_12.s();
        if (this.s()) {
            bl = bl && this.t() == mq_12.t();
        }
        boolean bl11 = bl = bl && this.u() == mq_12.u();
        if (this.u()) {
            bl = bl && this.v() == mq_12.v();
        }
        boolean bl12 = bl = bl && this.w() == mq_12.w();
        if (this.w()) {
            bl = bl && this.x() == mq_12.x();
        }
        bl = bl && this.y().equals(mq_12.y());
        boolean bl13 = bl = bl && this.A() == mq_12.A();
        if (this.A()) {
            bl = bl && this.B() == mq_12.B();
        }
        boolean bl14 = bl = bl && this.C() == mq_12.C();
        if (this.C()) {
            bl = bl && this.D() == mq_12.D();
        }
        boolean bl15 = bl = bl && this.E() == mq_12.E();
        if (this.E()) {
            bl = bl && this.F() == mq_12.F();
        }
        bl = bl && this.unknownFields.equals((Object)mq_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mq_1.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.g());
        }
        if (this.h()) {
            n = 37 * n + 4;
            n = 53 * n + this.i().hashCode();
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + this.l();
        }
        if (this.m()) {
            n = 37 * n + 6;
            n = 53 * n + this.n();
        }
        if (this.o()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.p());
        }
        if (this.q()) {
            n = 37 * n + 8;
            n = 53 * n + this.r();
        }
        if (this.s()) {
            n = 37 * n + 9;
            n = 53 * n + this.t();
        }
        if (this.u()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashLong((long)this.v());
        }
        if (this.w()) {
            n = 37 * n + 11;
            n = 53 * n + this.x();
        }
        if (this.z() > 0) {
            n = 37 * n + 12;
            n = 53 * n + this.y().hashCode();
        }
        if (this.A()) {
            n = 37 * n + 13;
            n = 53 * n + Internal.hashBoolean((boolean)this.B());
        }
        if (this.C()) {
            n = 37 * n + 14;
            n = 53 * n + this.D();
        }
        if (this.E()) {
            n = 37 * n + 15;
            n = 53 * n + this.F();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mq_1 a(ByteBuffer byteBuffer) {
        return (mq_1)p.parseFrom(byteBuffer);
    }

    public static mq_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_1)p.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mq_1 a(ByteString byteString) {
        return (mq_1)p.parseFrom(byteString);
    }

    public static mq_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_1)p.parseFrom(byteString, extensionRegistryLite);
    }

    public static mq_1 a(byte[] byArray) {
        return (mq_1)p.parseFrom(byArray);
    }

    public static mq_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_1)p.parseFrom(byArray, extensionRegistryLite);
    }

    public static mq_1 a(InputStream inputStream) {
        return (mq_1)GeneratedMessageV3.parseWithIOException(p, (InputStream)inputStream);
    }

    public static mq_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_1)GeneratedMessageV3.parseWithIOException(p, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mq_1 b(InputStream inputStream) {
        return (mq_1)GeneratedMessageV3.parseDelimitedWithIOException(p, (InputStream)inputStream);
    }

    public static mq_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_1)GeneratedMessageV3.parseDelimitedWithIOException(p, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mq_1 a(CodedInputStream codedInputStream) {
        return (mq_1)GeneratedMessageV3.parseWithIOException(p, (CodedInputStream)codedInputStream);
    }

    public static mq_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mq_1)GeneratedMessageV3.parseWithIOException(p, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mS G() {
        return mq_1.H();
    }

    public static mS H() {
        return I.I();
    }

    public static mS a(mq_1 mq_12) {
        return I.I().a(mq_12);
    }

    public mS I() {
        return this == I ? new mS() : new mS().a(this);
    }

    protected mS a(GeneratedMessageV3.BuilderParent builderParent) {
        mS mS2 = new mS(builderParent);
        return mS2;
    }

    public static mq_1 J() {
        return I;
    }

    public static Parser<mq_1> K() {
        return p;
    }

    public Parser<mq_1> getParserForType() {
        return p;
    }

    public mq_1 L() {
        return I;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.I();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.G();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.I();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.G();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.L();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.L();
    }

    static /* synthetic */ boolean M() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mq_1 mq_12) {
        return mq_12.unknownFields;
    }
}

