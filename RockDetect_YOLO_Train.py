from ultralytics import YOLO

# Create a new YOLO model from scratch
model = YOLO("yolov8n.yaml")

# Load a pretrained YOLO model (recommended for training)
model = YOLO("yolov8n.pt")

# Train the model using the 'coco8.yaml' dataset for 3 epochs
results = model.train(data="./open_pit_train.v2i.yolov8/data.yaml", epochs=50)

# Evaluate the model's performance on the validation set
results = model.val()

# Perform object detection on an image using the model
results = model("Rocas_Prueba.jpg")

# Export the model to PyTorch format
success = model.export(format="onnx")