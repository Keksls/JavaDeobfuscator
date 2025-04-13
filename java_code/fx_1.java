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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from fx
 */
public final class fx_1
extends GeneratedMessageV3.Builder<fx_1>
implements fy_1 {
    private int a;
    private List<fk_2> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<fk_2, fm_2, fn_2> c;

    public static final Descriptors.Descriptor a() {
        return fr_1.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.l.ensureFieldAccessorsInitialized(fv_2.class, fx_1.class);
    }

    fx_1() {
        this.m();
    }

    fx_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (fv_2.k()) {
            this.o();
        }
    }

    public fx_1 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fr_1.k;
    }

    public fv_2 f() {
        return fv_2.h();
    }

    public fv_2 g() {
        fv_2 fv_22 = this.h();
        if (!fv_22.isInitialized()) {
            throw fx_1.newUninitializedMessageException((Message)fv_22);
        }
        return fv_22;
    }

    public fv_2 h() {
        fv_2 fv_22 = new fv_2(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            fv_22.d = this.b;
        } else {
            fv_22.d = this.c.build();
        }
        this.onBuilt();
        return fv_22;
    }

    public fx_1 i() {
        return (fx_1)super.clone();
    }

    public fx_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fx_1)super.setField(fieldDescriptor, object);
    }

    public fx_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fx_1)super.clearField(fieldDescriptor);
    }

    public fx_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fx_1)super.clearOneof(oneofDescriptor);
    }

    public fx_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fx_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fx_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fx_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public fx_1 a(Message message) {
        if (message instanceof fv_2) {
            return this.a((fv_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fx_1 a(fv_2 fv_22) {
        if (fv_22 == fv_2.h()) {
            return this;
        }
        if (this.c == null) {
            if (!fv_22.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = fv_22.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(fv_22.d);
                }
                this.onChanged();
            }
        } else if (!fv_22.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = fv_22.d;
                this.a &= 0xFFFFFFFE;
                this.c = fv_2.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(fv_22.d);
            }
        }
        this.b(fv_2.b(fv_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fx_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fv_2 fv_22 = null;
        try {
            fv_22 = (fv_2)fv_2.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fv_22 = (fv_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fv_22 != null) {
                this.a(fv_22);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<fk_2>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<fk_2> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public fk_2 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (fk_2)this.c.getMessage(n);
    }

    public fx_1 a(int n, fk_2 fk_22) {
        if (this.c == null) {
            if (fk_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, fk_22);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)fk_22);
        }
        return this;
    }

    public fx_1 a(int n, fm_2 fm_22) {
        if (this.c == null) {
            this.n();
            this.b.set(n, fm_22.j());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)fm_22.j());
        }
        return this;
    }

    public fx_1 a(fk_2 fk_22) {
        if (this.c == null) {
            if (fk_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(fk_22);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)fk_22);
        }
        return this;
    }

    public fx_1 b(int n, fk_2 fk_22) {
        if (this.c == null) {
            if (fk_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, fk_22);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)fk_22);
        }
        return this;
    }

    public fx_1 a(fm_2 fm_22) {
        if (this.c == null) {
            this.n();
            this.b.add(fm_22.j());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)fm_22.j());
        }
        return this;
    }

    public fx_1 b(int n, fm_2 fm_22) {
        if (this.c == null) {
            this.n();
            this.b.add(n, fm_22.j());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)fm_22.j());
        }
        return this;
    }

    public fx_1 a(Iterable<? extends fk_2> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public fx_1 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public fx_1 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public fm_2 d(int n) {
        return (fm_2)this.o().getBuilder(n);
    }

    @Override
    public fn_2 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (fn_2)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fn_2> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public fm_2 k() {
        return (fm_2)this.o().addBuilder((AbstractMessage)fk_2.k());
    }

    public fm_2 e(int n) {
        return (fm_2)this.o().addBuilder(n, (AbstractMessage)fk_2.k());
    }

    public List<fm_2> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<fk_2, fm_2, fn_2> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final fx_1 a(UnknownFieldSet unknownFieldSet) {
        return (fx_1)super.setUnknownFields(unknownFieldSet);
    }

    public final fx_1 b(UnknownFieldSet unknownFieldSet) {
        return (fx_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

