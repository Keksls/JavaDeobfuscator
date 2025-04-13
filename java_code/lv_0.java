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
 * Renamed from lv
 */
public final class lv_0
extends GeneratedMessageV3.Builder<lv_0>
implements lw_0 {
    private int a;
    private List<lq_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<lq_0, ls, lx> c;

    public static final Descriptors.Descriptor a() {
        return kM.E;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.F.ensureFieldAccessorsInitialized(lt_0.class, lv_0.class);
    }

    lv_0() {
        this.m();
    }

    lv_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (lt_0.k()) {
            this.o();
        }
    }

    public lv_0 e() {
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
        return kM.E;
    }

    public lt_0 f() {
        return lt_0.h();
    }

    public lt_0 g() {
        lt_0 lt_02 = this.h();
        if (!lt_02.isInitialized()) {
            throw lv_0.newUninitializedMessageException((Message)lt_02);
        }
        return lt_02;
    }

    public lt_0 h() {
        lt_0 lt_02 = new lt_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            lt_02.d = this.b;
        } else {
            lt_02.d = this.c.build();
        }
        this.onBuilt();
        return lt_02;
    }

    public lv_0 i() {
        return (lv_0)super.clone();
    }

    public lv_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lv_0)super.setField(fieldDescriptor, object);
    }

    public lv_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lv_0)super.clearField(fieldDescriptor);
    }

    public lv_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lv_0)super.clearOneof(oneofDescriptor);
    }

    public lv_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lv_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lv_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lv_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public lv_0 a(Message message) {
        if (message instanceof lt_0) {
            return this.a((lt_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lv_0 a(lt_0 lt_02) {
        if (lt_02 == lt_0.h()) {
            return this;
        }
        if (this.c == null) {
            if (!lt_02.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = lt_02.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(lt_02.d);
                }
                this.onChanged();
            }
        } else if (!lt_02.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = lt_02.d;
                this.a &= 0xFFFFFFFE;
                this.c = lt_0.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(lt_02.d);
            }
        }
        this.b(lt_0.b(lt_02));
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

    public lv_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lt_0 lt_02 = null;
        try {
            lt_02 = (lt_0)lt_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lt_02 = (lt_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lt_02 != null) {
                this.a(lt_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<lq_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<lq_0> b() {
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
    public lq_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (lq_0)this.c.getMessage(n);
    }

    public lv_0 a(int n, lq_0 lq_02) {
        if (this.c == null) {
            if (lq_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, lq_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)lq_02);
        }
        return this;
    }

    public lv_0 a(int n, ls ls2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, ls2.i());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)ls2.i());
        }
        return this;
    }

    public lv_0 a(lq_0 lq_02) {
        if (this.c == null) {
            if (lq_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(lq_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)lq_02);
        }
        return this;
    }

    public lv_0 b(int n, lq_0 lq_02) {
        if (this.c == null) {
            if (lq_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, lq_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)lq_02);
        }
        return this;
    }

    public lv_0 a(ls ls2) {
        if (this.c == null) {
            this.n();
            this.b.add(ls2.i());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)ls2.i());
        }
        return this;
    }

    public lv_0 b(int n, ls ls2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, ls2.i());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)ls2.i());
        }
        return this;
    }

    public lv_0 a(Iterable<? extends lq_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public lv_0 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public lv_0 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public ls d(int n) {
        return (ls)this.o().getBuilder(n);
    }

    @Override
    public lx b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (lx)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lx> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public ls k() {
        return (ls)this.o().addBuilder((AbstractMessage)lq_0.j());
    }

    public ls e(int n) {
        return (ls)this.o().addBuilder(n, (AbstractMessage)lq_0.j());
    }

    public List<ls> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<lq_0, ls, lx> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final lv_0 a(UnknownFieldSet unknownFieldSet) {
        return (lv_0)super.setUnknownFields(unknownFieldSet);
    }

    public final lv_0 b(UnknownFieldSet unknownFieldSet) {
        return (lv_0)super.mergeUnknownFields(unknownFieldSet);
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

