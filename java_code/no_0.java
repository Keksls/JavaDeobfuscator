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
 * Renamed from nO
 */
public final class no_0
extends GeneratedMessageV3
implements nr_0 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    long g;
    public static final int b = 2;
    volatile Object h;
    public static final int c = 3;
    int i;
    private byte j = (byte)-1;
    private static final no_0 k = new no_0();
    @Deprecated
    public static final Parser<no_0> d = new np_0();

    no_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private no_0() {
        this.g = 0L;
        this.h = "";
        this.i = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    no_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.f |= 2;
                        this.h = byteString;
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 4;
                this.i = codedInputStream.readInt32();
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
        return ne_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ne_0.d.ensureFieldAccessorsInitialized(no_0.class, nq_0.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public long c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.h;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.h = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.h;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.h = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return (this.f & 4) == 4;
    }

    @Override
    public int h() {
        return this.i;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        if (!this.d()) {
            this.j = 0;
            return false;
        }
        if (!this.g()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt64(1, this.g);
        }
        if ((this.f & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.h);
        }
        if ((this.f & 4) == 4) {
            codedOutputStream.writeInt32(3, this.i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.g);
        }
        if ((this.f & 2) == 2) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.h);
        }
        if ((this.f & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof no_0)) {
            return super.equals(object);
        }
        no_0 no_02 = (no_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == no_02.b();
        if (this.b()) {
            bl = bl && this.c() == no_02.c();
        }
        boolean bl3 = bl = bl && this.d() == no_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(no_02.e());
        }
        boolean bl4 = bl = bl && this.g() == no_02.g();
        if (this.g()) {
            bl = bl && this.h() == no_02.h();
        }
        bl = bl && this.unknownFields.equals((Object)no_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + no_0.a().hashCode();
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
            n = 53 * n + this.h();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static no_0 a(ByteBuffer byteBuffer) {
        return (no_0)d.parseFrom(byteBuffer);
    }

    public static no_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (no_0)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static no_0 a(ByteString byteString) {
        return (no_0)d.parseFrom(byteString);
    }

    public static no_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (no_0)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static no_0 a(byte[] byArray) {
        return (no_0)d.parseFrom(byArray);
    }

    public static no_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (no_0)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static no_0 a(InputStream inputStream) {
        return (no_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static no_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (no_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static no_0 b(InputStream inputStream) {
        return (no_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static no_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (no_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static no_0 a(CodedInputStream codedInputStream) {
        return (no_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static no_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (no_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nq_0 i() {
        return no_0.j();
    }

    public static nq_0 j() {
        return k.k();
    }

    public static nq_0 a(no_0 no_02) {
        return k.k().a(no_02);
    }

    public nq_0 k() {
        return this == k ? new nq_0() : new nq_0().a(this);
    }

    protected nq_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        nq_0 nq_02 = new nq_0(builderParent);
        return nq_02;
    }

    public static no_0 l() {
        return k;
    }

    public static Parser<no_0> m() {
        return d;
    }

    public Parser<no_0> getParserForType() {
        return d;
    }

    public no_0 n() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(no_0 no_02) {
        return no_02.unknownFields;
    }
}

