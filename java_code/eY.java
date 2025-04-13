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

public final class eY
extends GeneratedMessageV3
implements fb {
    private static final long k = 0L;
    int l;
    public static final int a = 1;
    long m;
    public static final int b = 2;
    volatile Object n;
    public static final int c = 4;
    boolean o;
    public static final int d = 50;
    volatile Object p;
    public static final int e = 51;
    boolean q;
    public static final int f = 52;
    int r;
    public static final int g = 53;
    int s;
    public static final int h = 54;
    volatile Object t;
    public static final int i = 55;
    long u;
    private byte v = (byte)-1;
    private static final eY w = new eY();
    @Deprecated
    public static final Parser<eY> j = new eZ();

    eY(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eY() {
        this.m = 0L;
        this.n = "";
        this.o = false;
        this.p = "";
        this.q = false;
        this.r = -1;
        this.s = -1;
        this.t = "";
        this.u = -1L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block18: while (!bl2) {
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
                    case 8: {
                        this.l |= 1;
                        this.m = codedInputStream.readInt64();
                        continue block18;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.l |= 2;
                        this.n = byteString;
                        continue block18;
                    }
                    case 32: {
                        this.l |= 4;
                        this.o = codedInputStream.readBool();
                        continue block18;
                    }
                    case 402: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.l |= 8;
                        this.p = byteString;
                        continue block18;
                    }
                    case 408: {
                        this.l |= 0x10;
                        this.q = codedInputStream.readBool();
                        continue block18;
                    }
                    case 416: {
                        this.l |= 0x20;
                        this.r = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 424: {
                        this.l |= 0x40;
                        this.s = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 434: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.l |= 0x80;
                        this.t = byteString;
                        continue block18;
                    }
                    case 440: 
                }
                this.l |= 0x100;
                this.u = codedInputStream.readInt64();
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
        return eT.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eT.h.ensureFieldAccessorsInitialized(eY.class, fa.class);
    }

    @Override
    public boolean b() {
        return (this.l & 1) == 1;
    }

    @Override
    public long c() {
        return this.m;
    }

    @Override
    public boolean d() {
        return (this.l & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.n;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.n = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.n;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.n = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return (this.l & 4) == 4;
    }

    @Override
    public boolean h() {
        return this.o;
    }

    @Override
    public boolean i() {
        return (this.l & 8) == 8;
    }

    @Override
    public String j() {
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
    public ByteString k() {
        Object object = this.p;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.p = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean l() {
        return (this.l & 0x10) == 16;
    }

    @Override
    public boolean m() {
        return this.q;
    }

    @Override
    public boolean n() {
        return (this.l & 0x20) == 32;
    }

    @Override
    public int o() {
        return this.r;
    }

    @Override
    public boolean p() {
        return (this.l & 0x40) == 64;
    }

    @Override
    public int q() {
        return this.s;
    }

    @Override
    public boolean r() {
        return (this.l & 0x80) == 128;
    }

    @Override
    public String s() {
        Object object = this.t;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.t = string;
        }
        return string;
    }

    @Override
    public ByteString t() {
        Object object = this.t;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.t = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean u() {
        return (this.l & 0x100) == 256;
    }

    @Override
    public long v() {
        return this.u;
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
        if (!this.d()) {
            this.v = 0;
            return false;
        }
        if (!this.g()) {
            this.v = 0;
            return false;
        }
        this.v = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.l & 1) == 1) {
            codedOutputStream.writeInt64(1, this.m);
        }
        if ((this.l & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.n);
        }
        if ((this.l & 4) == 4) {
            codedOutputStream.writeBool(4, this.o);
        }
        if ((this.l & 8) == 8) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)50, (Object)this.p);
        }
        if ((this.l & 0x10) == 16) {
            codedOutputStream.writeBool(51, this.q);
        }
        if ((this.l & 0x20) == 32) {
            codedOutputStream.writeInt32(52, this.r);
        }
        if ((this.l & 0x40) == 64) {
            codedOutputStream.writeInt32(53, this.s);
        }
        if ((this.l & 0x80) == 128) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)54, (Object)this.t);
        }
        if ((this.l & 0x100) == 256) {
            codedOutputStream.writeInt64(55, this.u);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.m);
        }
        if ((this.l & 2) == 2) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.n);
        }
        if ((this.l & 4) == 4) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.o);
        }
        if ((this.l & 8) == 8) {
            n += GeneratedMessageV3.computeStringSize((int)50, (Object)this.p);
        }
        if ((this.l & 0x10) == 16) {
            n += CodedOutputStream.computeBoolSize((int)51, (boolean)this.q);
        }
        if ((this.l & 0x20) == 32) {
            n += CodedOutputStream.computeInt32Size((int)52, (int)this.r);
        }
        if ((this.l & 0x40) == 64) {
            n += CodedOutputStream.computeInt32Size((int)53, (int)this.s);
        }
        if ((this.l & 0x80) == 128) {
            n += GeneratedMessageV3.computeStringSize((int)54, (Object)this.t);
        }
        if ((this.l & 0x100) == 256) {
            n += CodedOutputStream.computeInt64Size((int)55, (long)this.u);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eY)) {
            return super.equals(object);
        }
        eY eY2 = (eY)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == eY2.b();
        if (this.b()) {
            bl = bl && this.c() == eY2.c();
        }
        boolean bl3 = bl = bl && this.d() == eY2.d();
        if (this.d()) {
            bl = bl && this.e().equals(eY2.e());
        }
        boolean bl4 = bl = bl && this.g() == eY2.g();
        if (this.g()) {
            bl = bl && this.h() == eY2.h();
        }
        boolean bl5 = bl = bl && this.i() == eY2.i();
        if (this.i()) {
            bl = bl && this.j().equals(eY2.j());
        }
        boolean bl6 = bl = bl && this.l() == eY2.l();
        if (this.l()) {
            bl = bl && this.m() == eY2.m();
        }
        boolean bl7 = bl = bl && this.n() == eY2.n();
        if (this.n()) {
            bl = bl && this.o() == eY2.o();
        }
        boolean bl8 = bl = bl && this.p() == eY2.p();
        if (this.p()) {
            bl = bl && this.q() == eY2.q();
        }
        boolean bl9 = bl = bl && this.r() == eY2.r();
        if (this.r()) {
            bl = bl && this.s().equals(eY2.s());
        }
        boolean bl10 = bl = bl && this.u() == eY2.u();
        if (this.u()) {
            bl = bl && this.v() == eY2.v();
        }
        bl = bl && this.unknownFields.equals((Object)eY2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eY.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.h());
        }
        if (this.i()) {
            n = 37 * n + 50;
            n = 53 * n + this.j().hashCode();
        }
        if (this.l()) {
            n = 37 * n + 51;
            n = 53 * n + Internal.hashBoolean((boolean)this.m());
        }
        if (this.n()) {
            n = 37 * n + 52;
            n = 53 * n + this.o();
        }
        if (this.p()) {
            n = 37 * n + 53;
            n = 53 * n + this.q();
        }
        if (this.r()) {
            n = 37 * n + 54;
            n = 53 * n + this.s().hashCode();
        }
        if (this.u()) {
            n = 37 * n + 55;
            n = 53 * n + Internal.hashLong((long)this.v());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eY a(ByteBuffer byteBuffer) {
        return (eY)j.parseFrom(byteBuffer);
    }

    public static eY a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eY)j.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eY a(ByteString byteString) {
        return (eY)j.parseFrom(byteString);
    }

    public static eY a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eY)j.parseFrom(byteString, extensionRegistryLite);
    }

    public static eY a(byte[] byArray) {
        return (eY)j.parseFrom(byArray);
    }

    public static eY a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eY)j.parseFrom(byArray, extensionRegistryLite);
    }

    public static eY a(InputStream inputStream) {
        return (eY)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream);
    }

    public static eY a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eY)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eY b(InputStream inputStream) {
        return (eY)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream);
    }

    public static eY b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eY)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eY a(CodedInputStream codedInputStream) {
        return (eY)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream);
    }

    public static eY a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eY)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fa w() {
        return eY.x();
    }

    public static fa x() {
        return w.y();
    }

    public static fa a(eY eY2) {
        return w.y().a(eY2);
    }

    public fa y() {
        return this == w ? new fa() : new fa().a(this);
    }

    protected fa a(GeneratedMessageV3.BuilderParent builderParent) {
        fa fa2 = new fa(builderParent);
        return fa2;
    }

    public static eY z() {
        return w;
    }

    public static Parser<eY> A() {
        return j;
    }

    public Parser<eY> getParserForType() {
        return j;
    }

    public eY B() {
        return w;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.y();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.w();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.w();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.B();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.B();
    }

    static /* synthetic */ boolean C() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eY eY2) {
        return eY2.unknownFields;
    }
}

