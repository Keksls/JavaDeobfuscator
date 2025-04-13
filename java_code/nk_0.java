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
 * Renamed from nK
 */
public final class nk_0
extends GeneratedMessageV3
implements nn_0 {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    long i;
    public static final int b = 2;
    long j;
    public static final int c = 3;
    volatile Object k;
    public static final int d = 4;
    long l;
    public static final int e = 5;
    boolean m;
    private byte n = (byte)-1;
    private static final nk_0 o = new nk_0();
    @Deprecated
    public static final Parser<nk_0> f = new nl_0();

    nk_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nk_0() {
        this.i = 0L;
        this.j = 0L;
        this.k = "";
        this.l = 0L;
        this.m = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nk_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block14;
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.h |= 1;
                        this.i = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 16: {
                        this.h |= 2;
                        this.j = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 26: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.h |= 4;
                        this.k = byteString;
                        continue block14;
                    }
                    case 32: {
                        this.h |= 8;
                        this.l = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 40: 
                }
                this.h |= 0x10;
                this.m = codedInputStream.readBool();
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
        return ne_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ne_0.f.ensureFieldAccessorsInitialized(nk_0.class, nm_0.class);
    }

    @Override
    public boolean b() {
        return (this.h & 1) == 1;
    }

    @Override
    public long c() {
        return this.i;
    }

    @Override
    public boolean d() {
        return (this.h & 2) == 2;
    }

    @Override
    public long e() {
        return this.j;
    }

    @Override
    public boolean f() {
        return (this.h & 4) == 4;
    }

    @Override
    public String g() {
        Object object = this.k;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.k = string;
        }
        return string;
    }

    @Override
    public ByteString h() {
        Object object = this.k;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.k = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean i() {
        return (this.h & 8) == 8;
    }

    @Override
    public long j() {
        return this.l;
    }

    @Override
    public boolean k() {
        return (this.h & 0x10) == 16;
    }

    @Override
    public boolean l() {
        return this.m;
    }

    public final boolean isInitialized() {
        byte by = this.n;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.n = 0;
            return false;
        }
        if (!this.d()) {
            this.n = 0;
            return false;
        }
        if (!this.f()) {
            this.n = 0;
            return false;
        }
        if (!this.i()) {
            this.n = 0;
            return false;
        }
        if (!this.k()) {
            this.n = 0;
            return false;
        }
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.h & 1) == 1) {
            codedOutputStream.writeInt64(1, this.i);
        }
        if ((this.h & 2) == 2) {
            codedOutputStream.writeInt64(2, this.j);
        }
        if ((this.h & 4) == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.k);
        }
        if ((this.h & 8) == 8) {
            codedOutputStream.writeInt64(4, this.l);
        }
        if ((this.h & 0x10) == 16) {
            codedOutputStream.writeBool(5, this.m);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.h & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.i);
        }
        if ((this.h & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.j);
        }
        if ((this.h & 4) == 4) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.k);
        }
        if ((this.h & 8) == 8) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.l);
        }
        if ((this.h & 0x10) == 16) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.m);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nk_0)) {
            return super.equals(object);
        }
        nk_0 nk_02 = (nk_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == nk_02.b();
        if (this.b()) {
            bl = bl && this.c() == nk_02.c();
        }
        boolean bl3 = bl = bl && this.d() == nk_02.d();
        if (this.d()) {
            bl = bl && this.e() == nk_02.e();
        }
        boolean bl4 = bl = bl && this.f() == nk_02.f();
        if (this.f()) {
            bl = bl && this.g().equals(nk_02.g());
        }
        boolean bl5 = bl = bl && this.i() == nk_02.i();
        if (this.i()) {
            bl = bl && this.j() == nk_02.j();
        }
        boolean bl6 = bl = bl && this.k() == nk_02.k();
        if (this.k()) {
            bl = bl && this.l() == nk_02.l();
        }
        bl = bl && this.unknownFields.equals((Object)nk_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nk_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.e());
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.j());
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.l());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nk_0 a(ByteBuffer byteBuffer) {
        return (nk_0)f.parseFrom(byteBuffer);
    }

    public static nk_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_0)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nk_0 a(ByteString byteString) {
        return (nk_0)f.parseFrom(byteString);
    }

    public static nk_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_0)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static nk_0 a(byte[] byArray) {
        return (nk_0)f.parseFrom(byArray);
    }

    public static nk_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_0)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static nk_0 a(InputStream inputStream) {
        return (nk_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static nk_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nk_0 b(InputStream inputStream) {
        return (nk_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static nk_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nk_0 a(CodedInputStream codedInputStream) {
        return (nk_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static nk_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nm_0 m() {
        return nk_0.n();
    }

    public static nm_0 n() {
        return o.o();
    }

    public static nm_0 a(nk_0 nk_02) {
        return o.o().a(nk_02);
    }

    public nm_0 o() {
        return this == o ? new nm_0() : new nm_0().a(this);
    }

    protected nm_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        nm_0 nm_02 = new nm_0(builderParent);
        return nm_02;
    }

    public static nk_0 p() {
        return o;
    }

    public static Parser<nk_0> q() {
        return f;
    }

    public Parser<nk_0> getParserForType() {
        return f;
    }

    public nk_0 r() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.r();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.r();
    }

    static /* synthetic */ boolean s() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(nk_0 nk_02) {
        return nk_02.unknownFields;
    }
}

