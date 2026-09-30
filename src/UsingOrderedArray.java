class UsingOrderedArray {
  public static void main(String[] args) {
    OrderedArray<Double> orderedArray = new OrderedArray<Double>(10);
    orderedArray.insert(10.0d);
    orderedArray.insert(9.0d);
    orderedArray.insert(3.0d);
    orderedArray.insert(3.0d);
    orderedArray.insert(3.0d);
    orderedArray.insert(5.0d);
    orderedArray.insert(1.0d);
    orderedArray.insert(3.0d);
    orderedArray.insert(4.0d);
    orderedArray.insert(12.0d);
    orderedArray.insert(13.0d);
    orderedArray.delete(3.0d);
    orderedArray.printInfo();
    System.out.printf("finding 4.0d: %d\n", orderedArray.binarySearch(4.0d));
  }
}
