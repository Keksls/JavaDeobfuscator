/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 * Renamed from gb
 */
public final class gb_1
extends GeneratedMessageV3.Builder<gb_1>
implements gc_1 {
    private int a;
    private gj_2 b = null;
    private SingleFieldBuilderV3<gj_2, gl_2, gn_2> c;
    private di_1 d = null;
    private SingleFieldBuilderV3<di_1, dk_1, dq_2> e;

    public static final Descriptors.Descriptor a() {
        return fx_2.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fx_2.b.ensureFieldAccessorsInitialized(fz_2.class, gb_1.class);
    }

    gb_1() {
        this.q();
    }

    gb_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.q();
    }

    private void q() {
        if (fz_2.n()) {
            this.r();
            this.s();
        }
    }

    public gb_1 h() {
        super.clear();
        if (this.c == null) {
            this.b = null;
        } else {
            this.c.clear();
        }
        this.a &= 0xFFFFFFFE;
        if (this.e == null) {
            this.d = null;
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fx_2.a;
    }

    public fz_2 i() {
        return fz_2.k();
    }

    public fz_2 j() {
        fz_2 fz_22 = this.k();
        if (!fz_22.isInitialized()) {
            throw gb_1.newUninitializedMessageException((Message)fz_22);
        }
        return fz_22;
    }

    public fz_2 k() {
        fz_2 fz_22 = new fz_2(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        fz_22.f = this.c == null ? this.b : (gj_2)this.c.build();
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        fz_22.g = this.e == null ? this.d : (di_1)this.e.build();
        fz_22.e = n2;
        this.onBuilt();
        return fz_22;
    }

    public gb_1 l() {
        return (gb_1)super.clone();
    }

    public gb_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gb_1)super.setField(fieldDescriptor, object);
    }

    public gb_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gb_1)super.clearField(fieldDescriptor);
    }

    public gb_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gb_1)super.clearOneof(oneofDescriptor);
    }

    public gb_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gb_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gb_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gb_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public gb_1 a(Message message) {
        if (message instanceof fz_2) {
            return this.a((fz_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gb_1 a(fz_2 fz_22) {
        if (fz_22 == fz_2.k()) {
            return this;
        }
        if (fz_22.b()) {
            this.b(fz_22.c());
        }
        if (fz_22.e()) {
            this.b(fz_22.f());
        }
        this.b(fz_2.b(fz_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.c().isInitialized()) {
            return false;
        }
        return !this.e() || this.f().isInitialized();
    }

    public gb_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fz_2 fz_22 = null;
        try {
            fz_22 = (fz_2)fz_2.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fz_22 = (fz_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fz_22 != null) {
                this.a(fz_22);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public gj_2 c() {
        if (this.c == null) {
            return this.b == null ? gj_2.k() : this.b;
        }
        return (gj_2)this.c.getMessage();
    }

    public gb_1 a(gj_2 gj_22) {
        if (this.c == null) {
            if (gj_22 == null) {
                throw new NullPointerException();
            }
            this.b = gj_22;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)gj_22);
        }
        this.a |= 1;
        return this;
    }

    public gb_1 a(gl_2 gl_22) {
        if (this.c == null) {
            this.b = gl_22.j();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)gl_22.j());
        }
        this.a |= 1;
        return this;
    }

    public gb_1 b(gj_2 gj_22) {
        if (this.c == null) {
            this.b = (this.a & 1) == 1 && this.b != null && this.b != gj_2.k() ? gj_2.a(this.b).a(gj_22).k() : gj_22;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)gj_22);
        }
        this.a |= 1;
        return this;
    }

    public gb_1 m() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.c.clear();
        }
        this.a &= 0xFFFFFFFE;
        return this;
    }

    public gl_2 n() {
        this.a |= 1;
        this.onChanged();
        return (gl_2)this.r().getBuilder();
    }

    @Override
    public gn_2 d() {
        if (this.c != null) {
            return (gn_2)this.c.getMessageOrBuilder();
        }
        return this.b == null ? gj_2.k() : this.b;
    }

    private SingleFieldBuilderV3<gj_2, gl_2, gn_2> r() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public di_1 f() {
        if (this.e == null) {
            return this.d == null ? di_1.j() : this.d;
        }
        return (di_1)this.e.getMessage();
    }

    public gb_1 a(di_1 di_12) {
        if (this.e == null) {
            if (di_12 == null) {
                throw new NullPointerException();
            }
            this.d = di_12;
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)di_12);
        }
        this.a |= 2;
        return this;
    }

    public gb_1 a(dk_1 dk_12) {
        if (this.e == null) {
            this.d = dk_12.i();
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)dk_12.i());
        }
        this.a |= 2;
        return this;
    }

    public gb_1 b(di_1 di_12) {
        if (this.e == null) {
            this.d = (this.a & 2) == 2 && this.d != null && this.d != di_1.j() ? di_1.a(this.d).a(di_12).j() : di_12;
            this.onChanged();
        } else {
            this.e.mergeFrom((AbstractMessage)di_12);
        }
        this.a |= 2;
        return this;
    }

    public gb_1 o() {
        if (this.e == null) {
            this.d = null;
            this.onChanged();
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public dk_1 p() {
        this.a |= 2;
        this.onChanged();
        return (dk_1)this.s().getBuilder();
    }

    @Override
    public dq_2 g() {
        if (this.e != null) {
            return (dq_2)this.e.getMessageOrBuilder();
        }
        return this.d == null ? di_1.j() : this.d;
    }

    private SingleFieldBuilderV3<di_1, dk_1, dq_2> s() {
        if (this.e == null) {
            this.e = new SingleFieldBuilderV3((AbstractMessage)this.f(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    public final gb_1 a(UnknownFieldSet unknownFieldSet) {
        return (gb_1)super.setUnknownFields(unknownFieldSet);
    }

    public final gb_1 b(UnknownFieldSet unknownFieldSet) {
        return (gb_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.h();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.l();
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
        return this.h();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.l();
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
        return this.l();
    }

    public /* synthetic */ Message buildPartial() {
        return this.k();
    }

    public /* synthetic */ Message build() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.k();
    }

    public /* synthetic */ MessageLite build() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Object clone() {
        return this.l();
    }
}

