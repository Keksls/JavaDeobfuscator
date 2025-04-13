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

/*
 * Renamed from mg
 */
public final class mg_0
extends GeneratedMessageV3
implements mj_0 {
    private static final long k = 0L;
    int l;
    public static final int a = 1;
    volatile Object m;
    public static final int b = 2;
    long n;
    public static final int c = 3;
    volatile Object o;
    public static final int d = 4;
    volatile Object p;
    public static final int e = 5;
    int q;
    public static final int f = 6;
    int r;
    public static final int g = 7;
    int s;
    public static final int h = 8;
    boolean t;
    public static final int i = 9;
    lt_0 u;
    private byte v = (byte)-1;
    private static final mg_0 w = new mg_0();
    @Deprecated
    public static final Parser<mg_0> j = new mh_0();

    mg_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mg_0() {
        this.m = "";
        this.n = 0L;
        this.o = "";
        this.p = "";
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mg_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block18: while (!bl2) {
                Object object;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block18;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block18;
                        bl2 = true;
                        continue block18;
                    }
                    case 10: {
                        object = codedInputStream.readBytes();
                        this.l |= 1;
                        this.m = object;
                        continue block18;
                    }
                    case 16: {
                        this.l |= 2;
                        this.n = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 26: {
                        object = codedInputStream.readBytes();
                        this.l |= 4;
                        this.o = object;
                        continue block18;
                    }
                    case 34: {
                        object = codedInputStream.readBytes();
                        this.l |= 8;
                        this.p = object;
                        continue block18;
                    }
                    case 40: {
                        this.l |= 0x10;
                        this.q = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 48: {
                        this.l |= 0x20;
                        this.r = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 56: {
                        this.l |= 0x40;
                        this.s = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 64: {
                        this.l |= 0x80;
                        this.t = codedInputStream.readBool();
                        continue block18;
                    }
                    case 74: 
                }
                object = null;
                if ((this.l & 0x100) == 256) {
                    object = this.u.g();
                }
                this.u = (lt_0)codedInputStream.readMessage(lt_0.b, extensionRegistryLite);
                if (object != null) {
                    ((lv_0)object).a(this.u);
                    this.u = ((lv_0)object).h();
                }
                this.l |= 0x100;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ma_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ma_0.d.ensureFieldAccessorsInitialized(mg_0.class, mi_0.class);
    }

    @Override
    public boolean b() {
        return (this.l & 1) == 1;
    }

    @Override
    public String c() {
        Object object = this.m;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.m = string;
        }
        return string;
    }

    @Override
    public ByteString d() {
        Object object = this.m;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.m = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean e() {
        return (this.l & 2) == 2;
    }

    @Override
    public long f() {
        return this.n;
    }

    @Override
    public boolean g() {
        return (this.l & 4) == 4;
    }

    @Override
    public String h() {
        Object object = this.o;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.o = string;
        }
        return string;
    }

    @Override
    public ByteString i() {
        Object object = this.o;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.o = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean j() {
        return (this.l & 8) == 8;
    }

    @Override
    public String k() {
        Object object = this.p;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.p = string;
        }
        return string;
    }

    @Override
    public ByteString l() {
        Object object = this.p;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.p = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean m() {
        return (this.l & 0x10) == 16;
    }

    @Override
    public int n() {
        return this.q;
    }

    @Override
    public boolean o() {
        return (this.l & 0x20) == 32;
    }

    @Override
    public int p() {
        return this.r;
    }

    @Override
    public boolean q() {
        return (this.l & 0x40) == 64;
    }

    @Override
    public int r() {
        return this.s;
    }

    @Override
    public boolean s() {
        return (this.l & 0x80) == 128;
    }

    @Override
    public boolean t() {
        return this.t;
    }

    @Override
    public boolean u() {
        return (this.l & 0x100) == 256;
    }

    @Override
    public lt_0 v() {
        return this.u == null ? lt_0.h() : this.u;
    }

    @Override
    public lw_0 w() {
        return this.u == null ? lt_0.h() : this.u;
    }

    public final boolean isInitialized() {
        byte by = this.v;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.v = 0;
            return false;
        }
        if (this.u() && !this.v().isInitialized()) {
            this.v = 0;
            return false;
        }
        this.v = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.l & 1) == 1) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.m);
        }
        if ((this.l & 2) == 2) {
            codedOutputStream.writeInt64(2, this.n);
        }
        if ((this.l & 4) == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.o);
        }
        if ((this.l & 8) == 8) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.p);
        }
        if ((this.l & 0x10) == 16) {
            codedOutputStream.writeInt32(5, this.q);
        }
        if ((this.l & 0x20) == 32) {
            codedOutputStream.writeInt32(6, this.r);
        }
        if ((this.l & 0x40) == 64) {
            codedOutputStream.writeInt32(7, this.s);
        }
        if ((this.l & 0x80) == 128) {
            codedOutputStream.writeBool(8, this.t);
        }
        if ((this.l & 0x100) == 256) {
            codedOutputStream.writeMessage(9, (MessageLite)this.v());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.l & 1) == 1) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.m);
        }
        if ((this.l & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.n);
        }
        if ((this.l & 4) == 4) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.o);
        }
        if ((this.l & 8) == 8) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.p);
        }
        if ((this.l & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.q);
        }
        if ((this.l & 0x20) == 32) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.r);
        }
        if ((this.l & 0x40) == 64) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.s);
        }
        if ((this.l & 0x80) == 128) {
            n += CodedOutputStream.computeBoolSize((int)8, (boolean)this.t);
        }
        if ((this.l & 0x100) == 256) {
            n += CodedOutputStream.computeMessageSize((int)9, (MessageLite)this.v());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mg_0)) {
            return super.equals(object);
        }
        mg_0 mg_02 = (mg_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == mg_02.b();
        if (this.b()) {
            bl = bl && this.c().equals(mg_02.c());
        }
        boolean bl3 = bl = bl && this.e() == mg_02.e();
        if (this.e()) {
            bl = bl && this.f() == mg_02.f();
        }
        boolean bl4 = bl = bl && this.g() == mg_02.g();
        if (this.g()) {
            bl = bl && this.h().equals(mg_02.h());
        }
        boolean bl5 = bl = bl && this.j() == mg_02.j();
        if (this.j()) {
            bl = bl && this.k().equals(mg_02.k());
        }
        boolean bl6 = bl = bl && this.m() == mg_02.m();
        if (this.m()) {
            bl = bl && this.n() == mg_02.n();
        }
        boolean bl7 = bl = bl && this.o() == mg_02.o();
        if (this.o()) {
            bl = bl && this.p() == mg_02.p();
        }
        boolean bl8 = bl = bl && this.q() == mg_02.q();
        if (this.q()) {
            bl = bl && this.r() == mg_02.r();
        }
        boolean bl9 = bl = bl && this.s() == mg_02.s();
        if (this.s()) {
            bl = bl && this.t() == mg_02.t();
        }
        boolean bl10 = bl = bl && this.u() == mg_02.u();
        if (this.u()) {
            bl = bl && this.v().equals(mg_02.v());
        }
        bl = bl && this.unknownFields.equals((Object)mg_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mg_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.f());
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + this.h().hashCode();
        }
        if (this.j()) {
            n = 37 * n + 4;
            n = 53 * n + this.k().hashCode();
        }
        if (this.m()) {
            n = 37 * n + 5;
            n = 53 * n + this.n();
        }
        if (this.o()) {
            n = 37 * n + 6;
            n = 53 * n + this.p();
        }
        if (this.q()) {
            n = 37 * n + 7;
            n = 53 * n + this.r();
        }
        if (this.s()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashBoolean((boolean)this.t());
        }
        if (this.u()) {
            n = 37 * n + 9;
            n = 53 * n + this.v().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mg_0 a(ByteBuffer byteBuffer) {
        return (mg_0)j.parseFrom(byteBuffer);
    }

    public static mg_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mg_0)j.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mg_0 a(ByteString byteString) {
        return (mg_0)j.parseFrom(byteString);
    }

    public static mg_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mg_0)j.parseFrom(byteString, extensionRegistryLite);
    }

    public static mg_0 a(byte[] byArray) {
        return (mg_0)j.parseFrom(byArray);
    }

    public static mg_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mg_0)j.parseFrom(byArray, extensionRegistryLite);
    }

    public static mg_0 a(InputStream inputStream) {
        return (mg_0)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream);
    }

    public static mg_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mg_0)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mg_0 b(InputStream inputStream) {
        return (mg_0)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream);
    }

    public static mg_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mg_0)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mg_0 a(CodedInputStream codedInputStream) {
        return (mg_0)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream);
    }

    public static mg_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mg_0)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mi_0 x() {
        return mg_0.y();
    }

    public static mi_0 y() {
        return w.z();
    }

    public static mi_0 a(mg_0 mg_02) {
        return w.z().a(mg_02);
    }

    public mi_0 z() {
        return this == w ? new mi_0() : new mi_0().a(this);
    }

    protected mi_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        mi_0 mi_02 = new mi_0(builderParent);
        return mi_02;
    }

    public static mg_0 A() {
        return w;
    }

    public static Parser<mg_0> B() {
        return j;
    }

    public Parser<mg_0> getParserForType() {
        return j;
    }

    public mg_0 C() {
        return w;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.z();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.x();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.z();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.x();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.C();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.C();
    }

    static /* synthetic */ boolean D() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mg_0 mg_02) {
        return mg_02.unknownFields;
    }
}

