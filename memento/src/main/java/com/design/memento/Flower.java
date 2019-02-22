package com.design.memento;

/**
 * 花
 */
public class Flower implements Plant {

    private FlowerType type;
    private final String name;
    private int height;
    private int weight;

    public void growing() {
        setWeight(getWeight() * 2);
        setHeight(getHeight() * 3);
        switch (type) {
            case SEED: {
                setType(FlowerType.BURGEON);
                break;
            }
            case BURGEON: {
                setType(FlowerType.BUD);
                break;
            }
            case BUD: {
                setType(FlowerType.BLOOM);
                break;
            }
            case BLOOM: {
                setType(FlowerType.DEAD);
                setHeight(0);
                setWeight(0);
                break;
            }
            default:
                break;
        }
    }

    FlowerMemento getMemento() {
        return new FlowerMemento(getType(), getHeight(), getWeight());
    }

    void setMemento(Plant plant) {
        FlowerMemento flowerMemento = (FlowerMemento) plant;
        setType(flowerMemento.getType());
        setHeight(flowerMemento.getHeight());
        setWeight(flowerMemento.getWeight());
    }

    @Override
    public String toString() {
        return String.format("名称：%s\t状态：%s\t质量：%d克\t高度：%d厘米", getName(), getType(), getWeight(), getHeight());
    }

    public Flower(FlowerType type, String name, int height, int weight) {
        this.type = type;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public FlowerType getType() {
        return this.type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private static class FlowerMemento implements Plant {

        private FlowerType type;
        private int height;
        private int weight;

        private FlowerMemento(FlowerType type, int height, int weight) {
            this.type = type;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int getWeight() {
            return weight;
        }

        @Override
        public int getHeight() {
            return height;
        }

        @Override
        public FlowerType getType() {
            return type;
        }
    }
}
