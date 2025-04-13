/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from mi
 */
public final class mi_0
extends GeneratedMessageV3.Builder<mi_0>
implements mj_0 {
    private int a;
    private Object b = "";
    private long c;
    private Object d = "";
    private Object e = "";
    private int f;
    private int g;
    private int h;
    private boolean i;
    private lt_0 j = null;
    private SingleFieldBuilderV3<lt_0, lv_0, lw_0> k;

    public static final Descriptors.Descriptor a() {
        return ma_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ma_0.d.ensureFieldAccessorsInitialized(mg_0.class, mi_0.class);
    }

    mi_0() {
        this.M();
    }

    mi_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.M();
    }

    private void M() {
        if (mg_0.D()) {
            this.N();
        }
    }

    public mi_0 x() {
        super.clear();
        this.b = "";
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = "";
        this.a &= 0xFFFFFFFB;
        this.e = "";
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = 0;
        this.a &= 0xFFFFFFDF;
        this.h = 0;
        this.a &= 0xFFFFFFBF;
        this.i = false;
        this.a &= 0xFFFFFF7F;
        if (this.k == null) {
            this.j = null;
        } else {
            this.k.clear();
        }
        this.a &= 0xFFFFFEFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ma_0.c;
    }

    public mg_0 y() {
        return mg_0.A();
    }

    public mg_0 z() {
        mg_0 mg_02 = this.A();
        if (!mg_02.isInitialized()) {
            throw mi_0.newUninitializedMessageException((Message)mg_02);
        }
        return mg_02;
    }

    public mg_0 A() {
        mg_0 mg_02 = new mg_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        mg_02.m = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        mg_02.n = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        mg_02.o = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        mg_02.p = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        mg_02.q = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        mg_02.r = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        mg_02.s = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        mg_02.t = this.i;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        mg_02.u = this.k == null ? this.j : (lt_0)this.k.build();
        mg_02.l = n2;
        this.onBuilt();
        return mg_02;
    }

    public mi_0 B() {
        return (mi_0)super.clone();
    }

    public mi_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mi_0)super.setField(fieldDescriptor, object);
    }

    public mi_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mi_0)super.clearField(fieldDescriptor);
    }

    public mi_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mi_0)super.clearOneof(oneofDescriptor);
    }

    public mi_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mi_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mi_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mi_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public mi_0 a(Message message) {
        if (message instanceof mg_0) {
            return this.a((mg_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mi_0 a(mg_0 mg_02) {
        if (mg_02 == mg_0.A()) {
            return this;
        }
        if (mg_02.b()) {
            this.a |= 1;
            this.b = mg_02.m;
            this.onChanged();
        }
        if (mg_02.e()) {
            this.a(mg_02.f());
        }
        if (mg_02.g()) {
            this.a |= 4;
            this.d = mg_02.o;
            this.onChanged();
        }
        if (mg_02.j()) {
            this.a |= 8;
            this.e = mg_02.p;
            this.onChanged();
        }
        if (mg_02.m()) {
            this.a(mg_02.n());
        }
        if (mg_02.o()) {
            this.b(mg_02.p());
        }
        if (mg_02.q()) {
            this.c(mg_02.r());
        }
        if (mg_02.s()) {
            this.a(mg_02.t());
        }
        if (mg_02.u()) {
            this.b(mg_02.v());
        }
        this.b(mg_0.b(mg_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        return !this.u() || this.v().isInitialized();
    }

    public mi_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mg_0 mg_02 = null;
        try {
            mg_02 = (mg_0)mg_0.j.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mg_02 = (mg_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mg_02 != null) {
                this.a(mg_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public String c() {
        Object object = this.b;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.b = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString d() {
        Object object = this.b;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.b = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public mi_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = string;
        this.onChanged();
        return this;
    }

    public mi_0 C() {
        this.a &= 0xFFFFFFFE;
        this.b = mg_0.A().c();
        this.onChanged();
        return this;
    }

    public mi_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public long f() {
        return this.c;
    }

    public mi_0 a(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public mi_0 D() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public String h() {
        Object object = this.d;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.d = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString i() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public mi_0 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = string;
        this.onChanged();
        return this;
    }

    public mi_0 E() {
        this.a &= 0xFFFFFFFB;
        this.d = mg_0.A().h();
        this.onChanged();
        return this;
    }

    public mi_0 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public String k() {
        Object object = this.e;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.e = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString l() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public mi_0 c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = string;
        this.onChanged();
        return this;
    }

    public mi_0 F() {
        this.a &= 0xFFFFFFF7;
        this.e = mg_0.A().k();
        this.onChanged();
        return this;
    }

    public mi_0 c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean m() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public int n() {
        return this.f;
    }

    public mi_0 a(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public mi_0 G() {
        this.a &= 0xFFFFFFEF;
        this.f = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean o() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public int p() {
        return this.g;
    }

    public mi_0 b(int n) {
        this.a |= 0x20;
        this.g = n;
        this.onChanged();
        return this;
    }

    public mi_0 H() {
        this.a &= 0xFFFFFFDF;
        this.g = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean q() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public int r() {
        return this.h;
    }

    public mi_0 c(int n) {
        this.a |= 0x40;
        this.h = n;
        this.onChanged();
        return this;
    }

    public mi_0 I() {
        this.a &= 0xFFFFFFBF;
        this.h = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean s() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public boolean t() {
        return this.i;
    }

    public mi_0 a(boolean bl) {
        this.a |= 0x80;
        this.i = bl;
        this.onChanged();
        return this;
    }

    public mi_0 J() {
        this.a &= 0xFFFFFF7F;
        this.i = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean u() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public lt_0 v() {
        if (this.k == null) {
            return this.j == null ? lt_0.h() : this.j;
        }
        return (lt_0)this.k.getMessage();
    }

    public mi_0 a(lt_0 lt_02) {
        if (this.k == null) {
            if (lt_02 == null) {
                throw new NullPointerException();
            }
            this.j = lt_02;
            this.onChanged();
        } else {
            this.k.setMessage((AbstractMessage)lt_02);
        }
        this.a |= 0x100;
        return this;
    }

    public mi_0 a(lv_0 lv_02) {
        if (this.k == null) {
            this.j = lv_02.g();
            this.onChanged();
        } else {
            this.k.setMessage((AbstractMessage)lv_02.g());
        }
        this.a |= 0x100;
        return this;
    }

    public mi_0 b(lt_0 lt_02) {
        if (this.k == null) {
            this.j = (this.a & 0x100) == 256 && this.j != null && this.j != lt_0.h() ? lt_0.a(this.j).a(lt_02).h() : lt_02;
            this.onChanged();
        } else {
            this.k.mergeFrom((AbstractMessage)lt_02);
        }
        this.a |= 0x100;
        return this;
    }

    public mi_0 K() {
        if (this.k == null) {
            this.j = null;
            this.onChanged();
        } else {
            this.k.clear();
        }
        this.a &= 0xFFFFFEFF;
        return this;
    }

    public lv_0 L() {
        this.a |= 0x100;
        this.onChanged();
        return (lv_0)this.N().getBuilder();
    }

    @Override
    public lw_0 w() {
        if (this.k != null) {
            return (lw_0)this.k.getMessageOrBuilder();
        }
        return this.j == null ? lt_0.h() : this.j;
    }

    private SingleFieldBuilderV3<lt_0, lv_0, lw_0> N() {
        if (this.k == null) {
            this.k = new SingleFieldBuilderV3((AbstractMessage)this.v(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.j = null;
        }
        return this.k;
    }

    public final mi_0 a(UnknownFieldSet unknownFieldSet) {
        return (mi_0)super.setUnknownFields(unknownFieldSet);
    }

    public final mi_0 b(UnknownFieldSet unknownFieldSet) {
        return (mi_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.x();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.B();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.x();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.B();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.B();
    }

    public /* synthetic */ Message buildPartial() {
        return this.A();
    }

    public /* synthetic */ Message build() {
        return this.z();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.x();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.B();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.A();
    }

    public /* synthetic */ MessageLite build() {
        return this.z();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.x();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.y();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.y();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.B();
    }

    public /* synthetic */ Object clone() {
        return this.B();
    }
}

