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
 * Renamed from kc
 */
public final class kc_0
extends GeneratedMessageV3
implements kf_0 {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    long h;
    public static final int b = 2;
    volatile Object i;
    public static final int c = 3;
    long j;
    public static final int d = 4;
    int k;
    private byte l = (byte)-1;
    private static final kc_0 m = new kc_0();
    @Deprecated
    public static final Parser<kc_0> e = new kd_0();

    kc_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kc_0() {
        this.h = 0L;
        this.i = "";
        this.j = 0L;
        this.k = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kc_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block13;
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.g |= 1;
                        this.h = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.g |= 2;
                        this.i = byteString;
                        continue block13;
                    }
                    case 24: {
                        this.g |= 4;
                        this.j = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 32: 
                }
                this.g |= 8;
                this.k = codedInputStream.readInt32();
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
        return jo_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jo_0.d.ensureFieldAccessorsInitialized(kc_0.class, ke_0.class);
    }

    @Override
    public boolean b() {
        return (this.g & 1) == 1;
    }

    @Override
    public long c() {
        return this.h;
    }

    @Override
    public boolean d() {
        return (this.g & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.i;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.i = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.i;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.i = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return (this.g & 4) == 4;
    }

    @Override
    public long h() {
        return this.j;
    }

    @Override
    public boolean i() {
        return (this.g & 8) == 8;
    }

    @Override
    public int j() {
        return this.k;
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.l = 0;
            return false;
        }
        if (!this.d()) {
            this.l = 0;
            return false;
        }
        if (!this.g()) {
            this.l = 0;
            return false;
        }
        if (!this.i()) {
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.g & 1) == 1) {
            codedOutputStream.writeInt64(1, this.h);
        }
        if ((this.g & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.i);
        }
        if ((this.g & 4) == 4) {
            codedOutputStream.writeInt64(3, this.j);
        }
        if ((this.g & 8) == 8) {
            codedOutputStream.writeInt32(4, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.g & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.h);
        }
        if ((this.g & 2) == 2) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.i);
        }
        if ((this.g & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.j);
        }
        if ((this.g & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.k);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kc_0)) {
            return super.equals(object);
        }
        kc_0 kc_02 = (kc_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == kc_02.b();
        if (this.b()) {
            bl = bl && this.c() == kc_02.c();
        }
        boolean bl3 = bl = bl && this.d() == kc_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(kc_02.e());
        }
        boolean bl4 = bl = bl && this.g() == kc_02.g();
        if (this.g()) {
            bl = bl && this.h() == kc_02.h();
        }
        boolean bl5 = bl = bl && this.i() == kc_02.i();
        if (this.i()) {
            bl = bl && this.j() == kc_02.j();
        }
        bl = bl && this.unknownFields.equals((Object)kc_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kc_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.h());
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + this.j();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kc_0 a(ByteBuffer byteBuffer) {
        return (kc_0)e.parseFrom(byteBuffer);
    }

    public static kc_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kc_0)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kc_0 a(ByteString byteString) {
        return (kc_0)e.parseFrom(byteString);
    }

    public static kc_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kc_0)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static kc_0 a(byte[] byArray) {
        return (kc_0)e.parseFrom(byArray);
    }

    public static kc_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kc_0)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static kc_0 a(InputStream inputStream) {
        return (kc_0)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static kc_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kc_0)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kc_0 b(InputStream inputStream) {
        return (kc_0)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static kc_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kc_0)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kc_0 a(CodedInputStream codedInputStream) {
        return (kc_0)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static kc_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kc_0)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ke_0 k() {
        return kc_0.l();
    }

    public static ke_0 l() {
        return m.m();
    }

    public static ke_0 a(kc_0 kc_02) {
        return m.m().a(kc_02);
    }

    public ke_0 m() {
        return this == m ? new ke_0() : new ke_0().a(this);
    }

    protected ke_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ke_0 ke_02 = new ke_0(builderParent);
        return ke_02;
    }

    public static kc_0 n() {
        return m;
    }

    public static Parser<kc_0> o() {
        return e;
    }

    public Parser<kc_0> getParserForType() {
        return e;
    }

    public kc_0 p() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.m();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.p();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.p();
    }

    static /* synthetic */ boolean q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kc_0 kc_02) {
        return kc_02.unknownFields;
    }
}

