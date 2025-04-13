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

public final class eV
extends GeneratedMessageV3
implements fk {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    long i;
    public static final int b = 2;
    volatile Object j;
    public static final int c = 3;
    volatile Object k;
    public static final int d = 50;
    int l;
    public static final int e = 51;
    volatile Object m;
    private byte n = (byte)-1;
    private static final eV o = new eV();
    @Deprecated
    public static final Parser<eV> f = new eW();

    eV(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eV() {
        this.i = 0L;
        this.j = "";
        this.k = "";
        this.l = 0;
        this.m = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eV(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                ByteString byteString;
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
                    case 18: {
                        byteString = codedInputStream.readBytes();
                        this.h |= 2;
                        this.j = byteString;
                        continue block14;
                    }
                    case 26: {
                        byteString = codedInputStream.readBytes();
                        this.h |= 4;
                        this.k = byteString;
                        continue block14;
                    }
                    case 400: {
                        this.h |= 8;
                        this.l = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 410: 
                }
                byteString = codedInputStream.readBytes();
                this.h |= 0x10;
                this.m = byteString;
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
        return eT.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eT.d.ensureFieldAccessorsInitialized(eV.class, eX.class);
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
    public String e() {
        Object object = this.j;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.j = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.j;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.j = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return (this.h & 4) == 4;
    }

    @Override
    public String h() {
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
    public ByteString i() {
        Object object = this.k;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.k = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean j() {
        return (this.h & 8) == 8;
    }

    @Override
    public int k() {
        return this.l;
    }

    @Override
    public boolean l() {
        return (this.h & 0x10) == 16;
    }

    @Override
    public String m() {
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
    public ByteString n() {
        Object object = this.m;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.m = byteString;
            return byteString;
        }
        return (ByteString)object;
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
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.h & 1) == 1) {
            codedOutputStream.writeInt64(1, this.i);
        }
        if ((this.h & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.j);
        }
        if ((this.h & 4) == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.k);
        }
        if ((this.h & 8) == 8) {
            codedOutputStream.writeInt32(50, this.l);
        }
        if ((this.h & 0x10) == 16) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)51, (Object)this.m);
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
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.j);
        }
        if ((this.h & 4) == 4) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.k);
        }
        if ((this.h & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)50, (int)this.l);
        }
        if ((this.h & 0x10) == 16) {
            n += GeneratedMessageV3.computeStringSize((int)51, (Object)this.m);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eV)) {
            return super.equals(object);
        }
        eV eV2 = (eV)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == eV2.b();
        if (this.b()) {
            bl = bl && this.c() == eV2.c();
        }
        boolean bl3 = bl = bl && this.d() == eV2.d();
        if (this.d()) {
            bl = bl && this.e().equals(eV2.e());
        }
        boolean bl4 = bl = bl && this.g() == eV2.g();
        if (this.g()) {
            bl = bl && this.h().equals(eV2.h());
        }
        boolean bl5 = bl = bl && this.j() == eV2.j();
        if (this.j()) {
            bl = bl && this.k() == eV2.k();
        }
        boolean bl6 = bl = bl && this.l() == eV2.l();
        if (this.l()) {
            bl = bl && this.m().equals(eV2.m());
        }
        bl = bl && this.unknownFields.equals((Object)eV2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eV.a().hashCode();
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
            n = 53 * n + this.h().hashCode();
        }
        if (this.j()) {
            n = 37 * n + 50;
            n = 53 * n + this.k();
        }
        if (this.l()) {
            n = 37 * n + 51;
            n = 53 * n + this.m().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eV a(ByteBuffer byteBuffer) {
        return (eV)f.parseFrom(byteBuffer);
    }

    public static eV a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eV)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eV a(ByteString byteString) {
        return (eV)f.parseFrom(byteString);
    }

    public static eV a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eV)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static eV a(byte[] byArray) {
        return (eV)f.parseFrom(byArray);
    }

    public static eV a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eV)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static eV a(InputStream inputStream) {
        return (eV)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static eV a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eV)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eV b(InputStream inputStream) {
        return (eV)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static eV b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eV)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eV a(CodedInputStream codedInputStream) {
        return (eV)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static eV a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eV)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eX o() {
        return eV.p();
    }

    public static eX p() {
        return o.q();
    }

    public static eX a(eV eV2) {
        return o.q().a(eV2);
    }

    public eX q() {
        return this == o ? new eX() : new eX().a(this);
    }

    protected eX a(GeneratedMessageV3.BuilderParent builderParent) {
        eX eX2 = new eX(builderParent);
        return eX2;
    }

    public static eV r() {
        return o;
    }

    public static Parser<eV> s() {
        return f;
    }

    public Parser<eV> getParserForType() {
        return f;
    }

    public eV t() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.q();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.q();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.o();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.t();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.t();
    }

    static /* synthetic */ boolean u() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eV eV2) {
        return eV2.unknownFields;
    }
}

