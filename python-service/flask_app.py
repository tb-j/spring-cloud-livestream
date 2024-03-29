from flask import Flask, request
import pandas as pd
import py_eureka_client.eureka_client as eureka_client

rest_port = 8050
eureka_client.init(eureka_server="http://localhost:8761/eureka",
                   app_name="python-service",
                   instance_port=rest_port)

app = Flask(__name__)

@app.route("/", methods=['GET'])
def hello():
    return "python data"

if __name__ == "__main__":
    app.run(host='0.0.0.0', port = rest_port)